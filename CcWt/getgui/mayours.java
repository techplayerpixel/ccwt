package me.Aryanbhai.CcWt.getgui;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.Aryanbhai.CcWt.teams.Team;
import me.Aryanbhai.CcWt.teams.TeamType;

public class mayours implements Listener{
	public static int lolanum = 0;
	public static int anitanum = 0;
	@EventHandler
	public void noInvOpen(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getClickedInventory().getName().equals("Mayour Lola")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("Vote!")) {
				Team.addToTeam(TeamType.lola, p);
				lolanum = +1;
				p.closeInventory();
				p.sendMessage("Voted to Lola!");
			}
			e.setCancelled(true);
		}
		if (e.getClickedInventory().getName().equals("Mayour Anita")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("Vote!")) {
				Team.addToTeam(TeamType.anita, p);
				anitanum = +1;
				p.closeInventory();
				p.sendMessage("Voted to Anita!");
			}
			e.setCancelled(true);
		}
	}
	public static void claerVotes() {
		lolanum = 0;
		anitanum = 0;
	}
	public static void checkVotes(Player p) {
		if (lolanum > anitanum) {
			p.sendMessage("Lola has more votes!");
		}
		if (anitanum > lolanum) {
			p.sendMessage("anita has more votes!");
		}
		if (anitanum == lolanum) {
			p.sendMessage("Both are equal!");
		}
	}
	public static void countVotes(Player p) {
		p.sendMessage("Lola has " + lolanum + "Votes!");
		p.sendMessage("Anita has " + anitanum + "Votes!");
	}
}
