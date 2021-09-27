package me.Aryanbhai.CcWt.givecmd;

import me.Aryanbhai.CcWt.customitems.itemsop;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class givecmd implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players can send this message");
			return true;
		}
		Player p = (Player) sender;
		if(p.hasPermission("ccwtitems.use")) {
			if(cmd.getName().equalsIgnoreCase("ccwtgui")) {
				Inventory gui = Bukkit.createInventory(p, 45,ChatColor.GRAY + "Get Items");
				ItemStack Aote = itemsop.Aote;
				ItemStack golem = itemsop.Golem;
				ItemStack emberrod = itemsop.EmberRod;
				ItemStack hurricanebow = itemsop.Hurricanebow;
				ItemStack grapplinghook = itemsop.GrapplingHook;
				ItemStack mms = itemsop.flyingsoup;
				ItemStack Maxe = itemsop.Maxe;
				ItemStack silverfang = itemsop.silverfang;
				ItemStack taxe = itemsop.Taxe;
				ItemStack tc = itemsop.Tc;
				ItemStack greaterhoe = itemsop.greaterhoe;
				ItemStack greathoe = itemsop.greathoe;
				ItemStack cactusknife = itemsop.cactusknife;
				ItemStack sweetaxe = itemsop.sweetaxe;
				ItemStack pigman = itemsop.pigman;
				ItemStack emeraldblade = itemsop.EmeraldBlade;
				ItemStack[] guiitems = {Aote,golem,emberrod,hurricanebow,grapplinghook,mms,Maxe,silverfang,taxe,tc,greaterhoe,greathoe
						,cactusknife,sweetaxe,pigman,emeraldblade};
				gui.setContents(guiitems);
				p.openInventory(gui);
			}
		}
		else {
			p.sendMessage("You are not allowed to use this command!");
		}
		return false;
	}
}
