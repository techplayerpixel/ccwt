package me.Aryanbhai.CcWt.createnpc;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import me.Aryanbhai.CcWt.Main;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import net.minecraft.server.v1_8_R3.PacketPlayOutEntityHeadRotation;
import net.minecraft.server.v1_8_R3.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import net.minecraft.server.v1_8_R3.PlayerInteractManager;
import net.minecraft.server.v1_8_R3.WorldServer;

public class treasurehunter{
	private static List<EntityPlayer> NPC = new ArrayList<EntityPlayer>();
	
	public static void createNPC(Player player,String name) {
		MinecraftServer server = ((CraftServer)Bukkit.getServer()).getServer();
		WorldServer world =((CraftWorld)Bukkit.getWorld(player.getWorld().getName())).getHandle();
		GameProfile gameprofile = new GameProfile(UUID.randomUUID(),name);
		EntityPlayer npc = new EntityPlayer(server,world,gameprofile,new PlayerInteractManager(world));
		npc.setLocation(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ(), player.getLocation().getYaw(), 
				player.getLocation().getPitch());
		
		String signature = "";
		String texture = "";
		gameprofile.getProperties().put("textures", new Property("textures",texture,signature));
		
		addNPCPacket(npc);
		NPC.add(npc);
		
		int var = 1;
		if (Main.getData().contains("data"))
			var = Main.getData().getConfigurationSection("data").getKeys(false).size()+1;
			
		Main.getData().set("data." + var + ".x", (int)player.getLocation().getX());
		Main.getData().set("data." + var + ".Y", (int)player.getLocation().getY());
		Main.getData().set("data." + var + ".Z", (int)player.getLocation().getZ());
		Main.getData().set("data." + var + ".Pitch", player.getLocation().getPitch());
		Main.getData().set("data." + var + ".Yaw", player.getLocation().getYaw());
		Main.getData().set("data." + var + ".World", player.getLocation().getWorld().getName());
		Main.getData().set("data." + var + ".Name", name);
		Main.getData().set("data." + var + ".text", texture);
		Main.getData().set("data." + var + ".signature", signature);
		Main.saveData();
	}
	public static void loadNPC(Location location,GameProfile profile) {
		MinecraftServer server = ((CraftServer)Bukkit.getServer()).getServer();
		WorldServer world =((CraftWorld)location.getWorld()).getHandle();
		GameProfile gameprofile = profile;
		EntityPlayer npc = new EntityPlayer(server,world,gameprofile,new PlayerInteractManager(world));
		npc.setLocation(location.getX(), location.getY(), location.getZ(), location.getYaw(), 
				location.getPitch());
		
		addNPCPacket(npc);
		NPC.add(npc);
	}
	public static void addNPCPacket(EntityPlayer npc) {
		for(Player player : Bukkit.getOnlinePlayers()) {
			PlayerConnection connection = ((CraftPlayer)player).getHandle().playerConnection;
			connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER,npc));
			connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
			connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc,(byte)(npc.yaw * 256 / 360)));
		}
	}
	public static void addJoinPacket(Player p) {
		for(EntityPlayer npc : NPC) {
			PlayerConnection connection = ((CraftPlayer)p).getHandle().playerConnection;
			connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER,npc));
			connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
			connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc,(byte)(npc.yaw * 256 / 360)));
		}
	}
	public static List<EntityPlayer> getNPCs(){
		return NPC;
	}
}
