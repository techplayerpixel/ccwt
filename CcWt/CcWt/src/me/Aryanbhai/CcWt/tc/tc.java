package me.Aryanbhai.CcWt.tc;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;

import me.Aryanbhai.CcWt.Main;

import org.bukkit.event.Listener;

public class tc implements Listener{
	Main plugin;
	public tc(Main plugin){
        this.plugin = plugin;
	}
	@EventHandler
    public void breakingBlock(final BlockBreakEvent e) {
        if (e.isCancelled()) {
            return;
        }
        if (e.getBlock().getType() != Material.LOG) {
            return;
        }
        if (!e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals("§5Treecapitator")) {
            return;
        }
        if (!e.getPlayer().getGameMode().equals((Object)GameMode.SURVIVAL)) {
            return;
        }
        this.breakBlock(e.getBlock(), e.getPlayer());
    }
    
    public void breakBlock(final Block b, final Player p) {
    	final Location blockbc = new Location (b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
    	final Block blockbcb = blockbc.getBlock();
        b.breakNaturally();
        if(p.getWorld().getName().equalsIgnoreCase("server")) {
        	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

	            @Override
	            public void run(){
	                if (b.getType() == Material.AIR) {
	                	b.setType(blockbcb.getType());
	                }
	            }
	        }, 200L);
        }
        final Location above = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY() + 1), (double)b.getLocation().getBlockZ());
        final Location down = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY() - 1), (double)b.getLocation().getBlockZ());
        final Location east = new Location(b.getWorld(), (double)b.getLocation().getBlockX() + 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
        final Location west = new Location(b.getWorld(), (double)b.getLocation().getBlockX() - 1, (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ());
        final Location north = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() - 1);
        final Location south = new Location(b.getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY()), (double)b.getLocation().getBlockZ() + 1);
        final Block blockNorth = north.getBlock();
        final Block blockSouth = south.getBlock();
        final Block blockWest = west.getBlock();
        final Block blockEast = east.getBlock();
        final Block blockAbove = above.getBlock();
        final Block blockDown = down.getBlock();
        if (blockAbove.getType() == Material.LOG) {
            this.breakBlock((blockAbove), p);
            if(p.getWorld().getName().equalsIgnoreCase("server")) {
            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    	            @Override
    	            public void run(){
    	                if (blockAbove.getType() == Material.AIR) {
    	                	blockAbove.setType(Material.LOG);
    	                }
    	            }
    	        }, 200L);
            }
        }
        if (blockDown.getType() == Material.LOG || blockDown.getType() == Material.LOG_2) {
            this.breakBlock((blockDown), p);
            if(p.getWorld().getName().equalsIgnoreCase("server")) {
            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    	            @Override
    	            public void run(){
    	                if (blockDown.getType() == Material.AIR) {
    	                	blockDown.setType(Material.LOG);
    	                }
    	            }
    	        }, 200L);
            }
        }
        if (blockWest.getType() == Material.LOG || blockWest.getType() == Material.LOG_2) {
            this.breakBlock((blockWest), p);
            if(p.getWorld().getName().equalsIgnoreCase("server")) {
            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    	            @Override
    	            public void run(){
    	                if (blockWest.getType() == Material.AIR) {
    	                	blockWest.setType(Material.LOG);
    	                }
    	            }
    	        }, 200L);
            }
        }
        if (blockEast.getType() == Material.LOG || blockEast.getType() == Material.LOG_2) {
            this.breakBlock((blockEast), p);
            if(p.getWorld().getName().equalsIgnoreCase("server")) {
            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    	            @Override
    	            public void run(){
    	                if (blockEast.getType() == Material.AIR) {
    	                	blockEast.setType(Material.LOG);
    	                }
    	            }
    	        }, 200L);
            }
        }
        if (blockNorth.getType() == Material.LOG || blockNorth.getType() == Material.LOG_2) {
            this.breakBlock((blockNorth), p);
            if(p.getWorld().getName().equalsIgnoreCase("server")) {
            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    	            @Override
    	            public void run(){
    	                if (blockNorth.getType() == Material.AIR) {
    	                	blockNorth.setType(Material.LOG);
    	                }
    	            }
    	        }, 200L);
            }
        }
        if (blockSouth.getType() == Material.LOG || blockSouth.getType() == Material.LOG_2) {
            this.breakBlock((blockSouth), p);
            if(p.getWorld().getName().equalsIgnoreCase("server")) {
            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){

    	            @Override
    	            public void run(){
    	                if (blockSouth.getType() == Material.AIR) {
    	                	blockSouth.setType(Material.LOG);
    	                }
    	            }
    	        }, 200L);
            }
        }
    }
}
