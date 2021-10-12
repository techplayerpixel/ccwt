package me.Aryanbhai.CcWt.createnpc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Npcsummoncmd implements CommandExecutor{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players can use the command!");
		}
		Player p = (Player) sender;
		if (p.hasPermission("npc.use")) {
			if (label.equalsIgnoreCase("npccreate")) {
				treasurehunter.createNPC(p,args[0]);
				p.sendMessage("NPC created!");
				return true;
			}
		}else {
			p.sendMessage("You dont have permission to use this command!");
		}
		return false;
	}
}
