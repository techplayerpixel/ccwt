package me.Aryanbhai.CcWt.createnpc;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import io.github.Leonardo0013YT.UltraSkills.Main;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayInUseEntity;

public class PacketReader {
	Channel channel;
	public static Map<UUID,Channel> channels = new HashMap<UUID,Channel>();
	
	public void inject(Player player) {
		CraftPlayer craftplayer = (CraftPlayer) player;
		channel = craftplayer.getHandle().playerConnection.networkManager.channel;
		channels.put(player.getUniqueId(),channel);
		
		if (channel.pipeline().get("PacketInjector") != null)
			return;
		
		channel.pipeline().addAfter("decoder", "PacketInjector", new MessageToMessageDecoder<PacketPlayInUseEntity>() {

			@Override
			protected void decode(ChannelHandlerContext channel, PacketPlayInUseEntity packet, List<Object> arg) throws Exception {
				arg.add(packet);
				readPacket(player,packet);
			}
		});
		
	}
	public void unInject(Player player) {
		channel = channels.get(player.getUniqueId());
		if (channel.pipeline().get("PacketInjector") != null) {
			channel.pipeline().remove("PacketInjector");
		}
	}
	public void readPacket(Player player,Packet<?> packet) {
		if (packet.getClass().getSimpleName().equalsIgnoreCase("PacketPlayInUseEntity")) {
			if (getValue(packet,"action").toString().equalsIgnoreCase("ATTACK")) {
				return;
			}
			if (getValue(packet,"action").toString().equalsIgnoreCase("INTERACT_AT")) {
				return;
			}
			int id = (int) getValue(packet, "a");
			if (getValue(packet,"action").toString().equalsIgnoreCase("INTERACT")) {
				for (EntityPlayer npc : treasurehunter.getNPCs()) {
					if (npc.getId() == id) {
						Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(Main.class), new Runnable() {
							@Override
							public void run() {
								Bukkit.getPluginManager().callEvent(new RightClickNPC(player,npc));
								
							}
						},0);
					}
				}
			}
			
		}
	}
	private Object getValue(Object instance,String name) {
		Object result = null;
		
		try {
			
			Field field = instance.getClass().getDeclaredField(name);
			field.setAccessible(true);
			
			result = field.get(instance);
			
			field.setAccessible(false);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
}
