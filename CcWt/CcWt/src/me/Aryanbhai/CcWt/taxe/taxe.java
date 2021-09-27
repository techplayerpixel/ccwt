package me.Aryanbhai.CcWt.taxe;

import java.util.Set;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import me.Aryanbhai.CcWt.Main;
import me.Aryanbhai.CcWt.customitems.itemsop;

public class taxe implements Listener{
	
	Main plugin;
	
	public taxe(Main plugin) {
	     this.plugin = plugin;
	}

	@EventHandler
    public void onInteract(PlayerInteractEvent event){
        if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)){
            Player player = event.getPlayer();
            if(player.getInventory().getItemInHand().getItemMeta() != null && player.getInventory().getItemInHand().getItemMeta().getLore() != null
                    && player.getInventory().getItemInHand().getItemMeta().getLore().contains("§6Item ability: Meat Hunter §e§lRIGHT CLICK")){

                String damage = "100";

                String finaldamage = damage;

                ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 0.5, 0), EntityType.ARMOR_STAND);

                as.setArms(true);
                as.setGravity(false);
                as.setVisible(false);
                as.setSmall(true);
                as.setMarker(true);
                as.setItemInHand(new ItemStack(Material.IRON_AXE));
                as.setRightArmPose(new EulerAngle(Math.toRadians(90), Math.toRadians(0), Math.toRadians(0)));

                player.getInventory().removeItem(player.getInventory().getItemInHand());

                Location dest = player.getLocation().add(player.getLocation().getDirection().multiply(10));
                Vector vector = dest.subtract(player.getLocation()).toVector();

                new BukkitRunnable(){
                    int distance = 30;
                    int i = 0;

                    public void run(){

                        EulerAngle rot = as.getRightArmPose();
                        EulerAngle rotnew = rot.add(20, 0, 0);
                        as.setRightArmPose(rotnew);

                        as.teleport(as.getLocation().add(vector.normalize()));

                        if(as.getTargetBlock((Set<Material>)null, 1) !=null && as.getTargetBlock((Set<Material>)null, 1).getType().isSolid()){
                            if(!as.isDead()){
                                as.remove();
                                if(player.getInventory().firstEmpty() != -1){
                                    player.getInventory().addItem(itemsop.Taxe);
                                }
                                else{
                                    player.getWorld().dropItemNaturally(player.getLocation(), itemsop.Taxe);
                                }
                                cancel();
                            }
                        }

                        for(Entity entity : as.getLocation().getChunk().getEntities()){
                            if(!as.isDead()){
                                if(as.getLocation().distanceSquared(entity.getLocation()) <= 1){
                                    if(entity != player && entity != as){
                                        if(entity instanceof LivingEntity){
                                            LivingEntity livingentity = (LivingEntity) entity;
                                            livingentity.damage(Integer.parseInt(finaldamage), player);
                                            as.remove();
                                            if(player.getInventory().firstEmpty() != -1){
                                                player.getInventory().addItem(itemsop.Taxe);
                                            }
                                            else{
                                                player.getWorld().dropItemNaturally(player.getLocation(), itemsop.Taxe);
                                            }
                                            cancel();
                                        }
                                    }
                                }
                            }
                        }

                        if(i > distance){
                            if(!as.isDead()){
                                as.remove();
                                if(player.getInventory().firstEmpty() != -1){
                                    player.getInventory().addItem(itemsop.Taxe);
                                }
                                else{
                                    player.getWorld().dropItemNaturally(player.getLocation(), itemsop.Taxe);
                                }
                                cancel();
                            }
                        }

                        i++;
                    }
                }.runTaskTimer(plugin, 0L, 1L);

                event.setCancelled(true);
            }
        }
    }
}
