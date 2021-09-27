package me.Aryanbhai.CcWt.flysoup;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.Aryanbhai.CcWt.Main;
import me.Aryanbhai.CcWt.Utils;

public class flysoup implements Listener{
	private Main plugin;
	public flysoup(Main plugin) {
		this.plugin = plugin;
	}
	@EventHandler
    public void OnPlayerInteract(PlayerInteractEvent event) {
		Player p = event.getPlayer();
        Action action = event.getAction();
        if (p.getInventory().getItemInHand().getItemMeta() != null && p.getInventory().getItemInHand().getItemMeta().getLore() != null
                && p.getInventory().getItemInHand().getItemMeta().getLore().contains("§7Gives you ability to fly on your island")) {
        	if (action == Action.RIGHT_CLICK_AIR) {
        		if (!event.getPlayer().getGameMode().equals((Object)GameMode.SURVIVAL)) {
        			return;
        		}
        		if(p.getWorld().getName().equalsIgnoreCase("islands")){
        			if (p.isFlying()) {
            			p.setAllowFlight(false);
            			p.setFlying(false);
            			p.sendMessage(Utils.chat(plugin.getConfig().getString("Cant_Fly_Message")));
            		}
            		if (!(p.isFlying())) {
            			p.getInventory().removeItem(p.getInventory().getItemInHand());
            			p.setAllowFlight(true);
            			p.setFlying(true);
            			p.sendMessage(Utils.chat(plugin.getConfig().getString("soup_used_Message")));
            			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    			            @Override
    			            public void run(){
    			                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_10_left")));
    			                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    					            @Override
    					            public void run(){
    					                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_9_left")));
    					                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    							            @Override
    							            public void run(){
    							                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_8_left")));
    							                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    									            @Override
    									            public void run(){
    									                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_7_left")));
    									                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    											            @Override
    											            public void run(){
    											                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_6_left")));
    											                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    													            @Override
    													            public void run(){
    													                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_5_left")));
    													                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    															            @Override
    															            public void run(){
    															                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_4_left")));
    															                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    																	            @Override
    																	            public void run(){
    																	                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_3_left")));
    																	                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    																			            @Override
    																			            public void run(){
    																			                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_2_left")));
    																			                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    																					            @Override
    																					            public void run(){
    																					                p.sendMessage(Utils.chat(plugin.getConfig().getString("sec_1_left")));
    																					                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    																							            @Override
    																							            public void run(){
    																							                p.sendMessage(Utils.chat(plugin.getConfig().getString("over")));
    																							                p.setAllowFlight(false);
    																							                p.setFlying(false);
    																							            }
    																							        }, 20L);
    																					            }
    																					        }, 20L);
    																			            }
    																			        }, 20L);
    																	            }
    																	        }, 20L);
    															            }
    															        }, 20L);
    													            }
    													        }, 20L);
    											            }
    											        }, 20L);
    									            }
    									        }, 20L);
    							            }
    							        }, 20L);
    					                
    					            }
    					        }, 20L);
    			            }
    			        }, 2200L);
            		}
        		}
        		if(p.getWorld().getName().equalsIgnoreCase("server")){
        			    p.setAllowFlight(false);
        			    p.setFlying(false);
        			}
        	}
        }
	}
}
