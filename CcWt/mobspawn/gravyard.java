package me.Aryanbhai.CcWt.mobspawn;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import me.Aryanbhai.CcWt.Main;

public class gravyard implements Listener,CommandExecutor{
	public static String zomts = "start";
	Main plugin;
	public gravyard(Main plugin) {
		this.plugin = plugin;
	}
	
	public static Location zom1;
	public static Location zom2;
	public static Location zom3;
	public static Location zom4;
	public static Location zom5;
	public static Location zom6;
	public static Location zom7;
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmds, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not allowed to send this message");
		}
		Player p = (Player) sender;
		if (p.hasPermission("setzom.use")) {
			if (cmds.getName().equalsIgnoreCase("setzom1")) {
				zom1 = p.getLocation();
				zom1.setWorld(p.getWorld());
				p.sendMessage("done!");
			}
			if (cmds.getName().equalsIgnoreCase("setzom2")) {
				zom2 = p.getLocation();
				zom2.setWorld(p.getWorld());
				p.sendMessage("done!");
			}
			if (cmds.getName().equalsIgnoreCase("setzom3")) {
				zom3 = p.getLocation();
				zom3.setWorld(p.getWorld());
				p.sendMessage("done!");
			}
			if (cmds.getName().equalsIgnoreCase("setzom4")) {
				zom4 = p.getLocation();
				zom4.setWorld(p.getWorld());
				p.sendMessage("done!");
			}
			if (cmds.getName().equalsIgnoreCase("setzom5")) {
				zom5 = p.getLocation();
				zom5.setWorld(p.getWorld());
				p.sendMessage("done!");
			}
			if (cmds.getName().equalsIgnoreCase("setzom6")) {
				zom6 = p.getLocation();
				zom6.setWorld(p.getWorld());
				p.sendMessage("done!");
			}
			if (cmds.getName().equalsIgnoreCase("setzom7")) {
				zom7 = p.getLocation();
				zom7.setWorld(p.getWorld());
				p.sendMessage("done!");
			}
			if (cmds.getName().equalsIgnoreCase("startzomspawn")) {
				zomts = "true";
				if (zom1 != null || zom2 != null || zom3 != null || zom4 != null || zom5 != null || zom6 != null || zom7 != null) {
					Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
						@Override
						public void run() {
							if (zomts.equalsIgnoreCase("true")) {
								Zombie zombie1 = zom1.getWorld().spawn(zom1, Zombie.class);
								Zombie zombie2 = zom2.getWorld().spawn(zom2, Zombie.class);
							    Zombie zombie3 = zom3.getWorld().spawn(zom3, Zombie.class);
								Zombie zombie4 = zom4.getWorld().spawn(zom4, Zombie.class);
								Zombie zombie5 = zom5.getWorld().spawn(zom5, Zombie.class);
							    Zombie zombie6 = zom6.getWorld().spawn(zom6, Zombie.class);
								Zombie zombie7 = zom7.getWorld().spawn(zom7, Zombie.class);
								
								zombie1.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
								zombie2.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
								zombie3.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
								zombie4.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
								zombie5.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
								zombie6.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
								zombie7.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
							}
						}
					}, 0, 200L);
				}
			}
			if (cmds.getName().equalsIgnoreCase("stopzomspawn")) {
				zomts.replace("true", "false");
			}
		}else {
			sender.sendMessage("you dont have permission");
		}
		
		return false;
	}
}
