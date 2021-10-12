package me.Aryanbhai.CcWt.customaxes;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class sweetaxe implements Listener{
	double randDouble = Math.random();
	@EventHandler
	public void logbreak(final BlockBreakEvent e) {
		if (e.isCancelled()) {
            return;
        }
        if (e.getBlock().getType() != Material.LOG && e.getBlock().getType() != Material.LOG_2) {
            return;
        }
        if (!e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals("§aSweet Axe")) {
            return;
        }
        if (!e.getPlayer().getGameMode().equals((Object)GameMode.SURVIVAL)) {
            return;
        }
        this.breakBlock(e.getBlock(), e.getPlayer());
	}
	public void breakBlock(final Block b, final Player p) {
		if(randDouble <= 0.25D) {
			b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.APPLE));
		}
	}
}
