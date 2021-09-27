package me.Aryanbhai.CcWt.customhoes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.Aryanbhai.CcWt.Main;

public class cactusknife implements Listener{
	Main plugin;
	public cactusknife(Main plugin){
        this.plugin = plugin;
    }
	@EventHandler
	public void caccutiing(PlayerInteractEvent e) {
		Block b = e.getClickedBlock();
		Player p = (Player) e.getPlayer();
		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (b.getType() == Material.CACTUS) {
				if (p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§5Cactus Knife")) {
					b.breakNaturally();
					if(p.getWorld().getName().equalsIgnoreCase("server")) {
						Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

				            @Override
				            public void run(){
				                if (b.getType() == Material.AIR) {
				                	b.setType(Material.CACTUS);
				                }
				            }
				        }, 200L);
					}
					}
				}
			}
		}
	}
