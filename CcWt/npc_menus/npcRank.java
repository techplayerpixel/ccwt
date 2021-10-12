package me.Aryanbhai.CcWt.npc_menus;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.Aryanbhai.CcWt.customitems.itemsop;

public class npcRank implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§aOnly players can use this command");
			return true;
		}
		Player p = (Player) sender;
		if (p.hasPermission("ccwt.use")) {
			if (cmd.getName().equalsIgnoreCase("npcrank")) {
				Inventory gui = Bukkit.createInventory(p, 27,"§aRanks!");
				ItemStack black = itemsop.black;
				ItemStack vip = itemsop.vip;
				ItemStack mvp = itemsop.mvp;
				ItemStack mvppro = itemsop.mvppro;
				ItemStack[] guiitems = {black,black,black,black,black,black,black,black,black
						,black,black,vip,black,mvp,black,mvppro,black,black
						,black,black,black,black,black,black,black,black,black};
				gui.setContents(guiitems);
				p.openInventory(gui);
			}
		}
		return false;
	}
}
