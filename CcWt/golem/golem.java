package me.Aryanbhai.CcWt.golem;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.ArmorStand;
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
        	ArmorStand as = (ArmorStand) p.getLocation().getWorld().spawn(p.getLocation(), ArmorStand.class);
        	as.setVisible(false);
			for (final Entity entity : as.getNearbyEntities(5.0, 5.0, 5.0)) {
				if (entity instanceof NPC) {
					return true;
				}
				if(entity instanceof Player) {
					return true;
				}
				if (entity instanceof Monster) {
					if (as.getLocation().distanceSquared(entity.getLocation()) < 1){
						Monster m = (Monster) entity;
						m.damage(50,p);
						as.remove();
						
					}
				}
		    }
        }
        return true;
    }
}