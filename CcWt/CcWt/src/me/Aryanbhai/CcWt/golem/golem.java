package me.Aryanbhai.CcWt.golem;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class golem implements Listener
{
	@EventHandler
    public boolean OnPlayerInteract(PlayerInteractEvent event ) {
        Player p = event.getPlayer();
        Action action = event.getAction();
        if (action == Action.RIGHT_CLICK_AIR && p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§9Golem sword")) {
			for (final Entity entity : p.getNearbyEntities(10.0, 10.0, 10.0)) {
				if (!(entity instanceof NPC)) {
					continue;
				}
				Monster m = (Monster) entity;
				if (entity instanceof Monster) {
					m.damage(300);
				}
				
			}
           }
           return true;
       }
}