package me.Aryanbhai.CcWt.Gh;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class GrapplingHook implements Listener{
	@EventHandler
    public void onFish(PlayerFishEvent event){

        Player player = event.getPlayer();

        if (player.getInventory().getItemInHand().getItemMeta() != null && player.getInventory().getItemInHand().getItemMeta().getLore() != null 
        && player.getInventory().getItemInHand().getItemMeta().getLore().contains("�7Travel in style with this tool...")) {
            if (event.getState().equals(PlayerFishEvent.State.FAILED_ATTEMPT)) {
                if (ghcooldown.checkCooldown(player)) {
                    Location playerLocation = player.getLocation();
                    Location hookLocation = event.getHook().getLocation();
                    Location change = hookLocation.subtract(playerLocation);
                    player.setVelocity(change.toVector().multiply(0.3));
                    ghcooldown.setCooldown(player, 5);
                } else {
                    player.sendMessage(ChatColor.DARK_RED + "Item Ability is not ready yet");
                }
            }
        }
    }
}

