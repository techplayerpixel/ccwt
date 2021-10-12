package me.Aryanbhai.CcWt.createnpc;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class onJoin implements Listener{
	@EventHandler
	public void onJoinEvent(PlayerJoinEvent e) {
		if (treasurehunter.getNPCs() == null) {
			return;
		}
		if (treasurehunter.getNPCs().isEmpty()) {
			return;
		}
		treasurehunter.addJoinPacket(e.getPlayer());
		PacketReader reader = new PacketReader();
		reader.inject(e.getPlayer());
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		PacketReader reader = new PacketReader();
		reader.unInject(e.getPlayer());
	}
}
