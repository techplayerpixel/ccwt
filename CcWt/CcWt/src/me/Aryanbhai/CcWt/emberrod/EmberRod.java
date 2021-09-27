package me.Aryanbhai.CcWt.emberrod;

import me.Aryanbhai.CcWt.Main;

import org.bukkit.Effect;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

import io.github.Leonardo0013YT.UltraSkills.api.UltraSkillsAPI;

public class EmberRod implements Listener{
	Main plugin;
	public EmberRod(Main plugin){
        this.plugin = plugin;
    }
	
	@EventHandler
    public void onInteract(PlayerInteractEvent event){
        if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)){
            if(event.getPlayer().getInventory().getItemInHand().getItemMeta() != null && event.getPlayer().getInventory().getItemInHand().getItemMeta().getLore() != null
                    && event.getPlayer().getInventory().getItemInHand().getItemMeta().getLore().contains("§6Item Ability: Fire Blast§e§lRIGHT CLICK")){

                Fireball fireball = event.getPlayer().getWorld().spawn(event.getPlayer().getEyeLocation().add(0,0.2,0), Fireball.class);
                fireball.setYield(0);
                fireball.setVelocity(event.getPlayer().getLocation().getDirection().multiply(2));
                UltraSkillsAPI.removeIntelligence(event.getPlayer(), 50);

                new BukkitRunnable(){
                    public void run(){
                        if(!fireball.isDead()){
                            fireball.getWorld().playEffect(fireball.getLocation(), Effect.FLAME,1);
                        }
                        else{
                            cancel();
                        }
                    }
                }.runTaskTimer(plugin, 0L, 2L);

                event.getPlayer().getInventory().getItemInHand().setAmount(event.getPlayer().getInventory().getItemInHand().getAmount() - 1);

                event.setCancelled(true);
            }
        }
    }
}
