package me.Aryanbhai.CcWt.npc_menus;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.Aryanbhai.CcWt.customitems.itemsop;
import me.Aryanbhai.CcWt.getgui.mayours;
import me.Aryanbhai.CcWt.teams.Team;

public class mayourlola implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players can use this command");
			return true;
		}
		Player p = (Player) sender;
		
		if (p.hasPermission("npcmenus.use")) {
			if (cmd.getName().equalsIgnoreCase("mlola")) {
				if (!Team.isInTeamLola(p) && !Team.isInTeamAnita(p)) {
					Inventory lolainv = Bukkit.createInventory(p, 27, "Mayour Lola");
					ItemStack vote = itemsop.votelola;
					lolainv.setItem(13, vote);
					p.openInventory(lolainv);
				}else {
					p.sendMessage("You have already voted!");
				}
			}
			if (cmd.getName().equalsIgnoreCase("manita")) {
				if (!Team.isInTeamLola(p) && !Team.isInTeamAnita(p)) {
					Inventory lolainv = Bukkit.createInventory(p, 27, "Mayour Anita");
					ItemStack vote = itemsop.votelola;
					lolainv.setItem(13, vote);
					p.openInventory(lolainv);
				}else {
					p.sendMessage("You have already voted!");
				}
			}
			if (cmd.getName().equalsIgnoreCase("clearTeams")) {
				Team.clearTeams();
			}
			if (cmd.getName().equalsIgnoreCase("getplayerteam")) {
				Team.checkTeam(p);
			}
			if (cmd.getName().equalsIgnoreCase("Clearvotes")) {
				mayours.claerVotes();
			}
			if (cmd.getName().equalsIgnoreCase("checkvotes")) {
				mayours.checkVotes(p);
			}
			if (cmd.getName().equalsIgnoreCase("countvotes")) {
				mayours.countVotes(p);
			}
		}
		return false;
	}
}
