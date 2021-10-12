package me.Aryanbhai.CcWt.customhoes;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class greattillinghoe implements Listener{
	@EventHandler
	public void greattilling(PlayerInteractEvent e) {
		Player p = (Player) e.getPlayer();
		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			Material m = e.getClickedBlock().getType();
			if (m.equals(Material.DIRT) || m.equals(Material.GRASS)) {
				Block b = (Block) e.getClickedBlock();
				if(p.getWorld().getName().equalsIgnoreCase("islands")) {
					if (p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§aHoe of Greater Tilling")) {
						Location above1 = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
						Location above2 = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 2);
						Location down1 = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
						Location down2 = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 2);
						Location east1 = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
						Location east2 = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
						Location west1 = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
						Location west2 = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
						Location topleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 2);
						Location rtopleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 2);
						Location dtopleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
						Location drtopleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
						Location topright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 2);
						Location ltopright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ()- 2);
						Location dtopright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
						Location dltopright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
						Location downleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 2);
						Location rdownleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 2);
						Location udownleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
						Location urdownleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
						Location downright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 2);
						Location ldownright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 2);
						Location udownright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 2, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
						Location uldownright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
						Block blockabove1 = above1.getBlock();
						Block blockabove2 = above2.getBlock();
						Block blockdown1 = down1.getBlock();
						Block blockdown2 = down2.getBlock();
						Block blockeast1 = east1.getBlock();
						Block blockeast2 = east2.getBlock();
						Block blockwest1 = west1.getBlock();
						Block blockwest2 = west2.getBlock();
						Block blocktopleft = topleft.getBlock();
						Block blockrtopleft = rtopleft.getBlock();
						Block blockdtopleft = dtopleft.getBlock();
						Block blockdrtopleft = drtopleft.getBlock();
						Block blocktopright = topright.getBlock();
						Block blockltopright = ltopright.getBlock();
						Block blockdtopright = dtopright.getBlock();
						Block blockdltopright = dltopright.getBlock();
						Block blockdownleft = downleft.getBlock();
						Block blockudownleft = udownleft.getBlock();
						Block blockrdownleft = rdownleft.getBlock();
						Block blockurdownleft = urdownleft.getBlock();
						Block blockdownright = downright.getBlock();
						Block blockldownright = ldownright.getBlock();
						Block blockudownright = udownright.getBlock();
						Block blockuldownright = uldownright.getBlock();
						if (blockabove1.getType().equals(Material.DIRT) || blockabove1.getType().equals(Material.GRASS)) {
							blockabove1.setType(Material.SOIL);
						}
						if (blockabove2.getType().equals(Material.DIRT) || blockabove2.getType().equals(Material.GRASS)) {
							blockabove2.setType(Material.SOIL);
						}
						if (blockdown1.getType().equals(Material.DIRT) || blockdown1.getType().equals(Material.GRASS)) {
							blockdown1.setType(Material.SOIL);
						}
						if (blockdown2.getType().equals(Material.DIRT) || blockdown2.getType().equals(Material.GRASS)) {
							blockdown2.setType(Material.SOIL);
						}
						if (blockeast1.getType().equals(Material.DIRT) || blockeast1.getType().equals(Material.GRASS)) {
							blockeast1.setType(Material.SOIL);
						}
						if (blockeast2.getType().equals(Material.DIRT) || blockeast2.getType().equals(Material.GRASS)) {
							blockeast2.setType(Material.SOIL);
						}
						if (blockwest2.getType().equals(Material.DIRT) || blockwest2.getType().equals(Material.GRASS)) {
							blockwest2.setType(Material.SOIL);
						}
						if (blockwest1.getType().equals(Material.DIRT) || blockwest1.getType().equals(Material.GRASS)) {
							blockwest1.setType(Material.SOIL);
						}
						if (blocktopleft.getType().equals(Material.DIRT) || blocktopleft.getType().equals(Material.GRASS)) {
							blocktopleft.setType(Material.SOIL);
						}
						if (blockrtopleft.getType().equals(Material.DIRT) || blockrtopleft.getType().equals(Material.GRASS)) {
							blockrtopleft.setType(Material.SOIL);
						}
						if (blockdtopleft.getType().equals(Material.DIRT) || blockdtopleft.getType().equals(Material.GRASS)) {
							blockdtopleft.setType(Material.SOIL);
						}
						if (blockdrtopleft.getType().equals(Material.DIRT) || blockdrtopleft.getType().equals(Material.GRASS)) {
							blockdrtopleft.setType(Material.SOIL);
						}
						if (blocktopright.getType().equals(Material.DIRT) || blocktopright.getType().equals(Material.GRASS)) {
							blocktopright.setType(Material.SOIL);
						}
						if (blockltopright.getType().equals(Material.DIRT) || blockltopright.getType().equals(Material.GRASS)) {
							blockltopright.setType(Material.SOIL);
						}
						if (blockdtopright.getType().equals(Material.DIRT) || blockdtopright.getType().equals(Material.GRASS)) {
							blockdtopright.setType(Material.SOIL);
						}
						if (blockdltopright.getType().equals(Material.DIRT) || blockdltopright.getType().equals(Material.GRASS)) {
							blockdltopright.setType(Material.SOIL);
						}
						if (blockdownleft.getType().equals(Material.DIRT) || blockdownleft.getType().equals(Material.GRASS)) {
							blockdownleft.setType(Material.SOIL);
						}
						if (blockrdownleft.getType().equals(Material.DIRT) || blockrdownleft.getType().equals(Material.GRASS)) {
							blockrdownleft.setType(Material.SOIL);
						}
						if (blockudownleft.getType().equals(Material.DIRT) || blockudownleft.getType().equals(Material.GRASS)) {
							blockudownleft.setType(Material.SOIL);
						}
						if (blockurdownleft.getType().equals(Material.DIRT) || blockurdownleft.getType().equals(Material.GRASS)) {
							blockurdownleft.setType(Material.SOIL);
						}
						if (blockdownright.getType().equals(Material.DIRT) || blockdownright.getType().equals(Material.GRASS)) {
							blockdownright.setType(Material.SOIL);
						}
						if (blockldownright.getType().equals(Material.DIRT) || blockldownright.getType().equals(Material.GRASS)) {
							blockldownright.setType(Material.SOIL);
						}
						if (blockudownright.getType().equals(Material.DIRT) || blockudownright.getType().equals(Material.GRASS)) {
							blockudownright.setType(Material.SOIL);
						}
						if (blockuldownright.getType().equals(Material.DIRT) || blockuldownright.getType().equals(Material.GRASS)) {
							blockuldownright.setType(Material.SOIL);
						}
					}
					if (p.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("§aHoe of Great Tilling")) {
						Location above1 = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
						Location east1 = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
						Location west1 = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
						Location down1 = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
						Location drtopleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
						Location dltopright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
						Location urdownleft = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
						Location uldownright = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
						Block blockabove1 = above1.getBlock();
						Block blockeast1 = east1.getBlock();
						Block blockwest1 = west1.getBlock();
						Block blockdown1 = down1.getBlock();
						Block blocktopleft = drtopleft.getBlock();
						Block blocktopright = dltopright.getBlock();
						Block blockdownleft = urdownleft.getBlock();
						Block blockdownright = uldownright.getBlock();
						if (blockabove1.getType().equals(Material.DIRT) || blockabove1.getType().equals(Material.GRASS)) {
							blockabove1.setType(Material.SOIL);
						}
						if (blockeast1.getType().equals(Material.DIRT) || blockeast1.getType().equals(Material.GRASS)) {
							blockeast1.setType(Material.SOIL);
						}
						if (blockwest1.getType().equals(Material.DIRT) || blockwest1.getType().equals(Material.GRASS)) {
							blockwest1.setType(Material.SOIL);
						}
						if (blockdown1.getType().equals(Material.DIRT) || blockdown1.getType().equals(Material.GRASS)) {
							blockdown1.setType(Material.SOIL);
						}
						if (blocktopleft.getType().equals(Material.DIRT) || blocktopleft.getType().equals(Material.GRASS)) {
							blocktopleft.setType(Material.SOIL);
						}
						if (blocktopright.getType().equals(Material.DIRT) || blocktopright.getType().equals(Material.GRASS)) {
							blocktopright.setType(Material.SOIL);
						}
						if (blockdownleft.getType().equals(Material.DIRT) || blockdownleft.getType().equals(Material.GRASS)) {
							blockdownleft.setType(Material.SOIL);
						}
						if (blockdownright.getType().equals(Material.DIRT) || blockdownright.getType().equals(Material.GRASS)) {
							blockdownright.setType(Material.SOIL);
						}
					}
				}	
			}
		}
	}
}
