package me.Aryanbhai.CcWt.createnpc;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class npcClick implements Listener{
	@EventHandler
	public void onClick(RightClickNPC e) {
		Player player = e.getPlayer();
		player.sendMessage("yo bit");
	}
}
