package me.Aryanbhai.CcWt.aotesword;

import org.bukkit.event.EventHandler;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.Sound;
import java.util.Set;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class aotesword implements Listener
{
    @EventHandler
    public void OnPlayerInteract(final PlayerInteractEvent event) {
        final Player p = event.getPlayer();
        final Action action = event.getAction();
        if (action == Action.RIGHT_CLICK_AIR && p.getItemInHand().getItemMeta().getDisplayName().equals("§9Aspect of the end")) {
            final Block block = p.getTargetBlock((Set<Material>)null, 8);
            final Location location = block.getLocation();
            final float pitch = p.getEyeLocation().getPitch();
            final float yaw = p.getEyeLocation().getYaw();
            location.add(0.0, 1.0, 0.0);
            location.setYaw(yaw);
            location.setPitch(pitch);
            p.teleport(location);
            p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 5.0f, 5.0f);
        }
    }
}
