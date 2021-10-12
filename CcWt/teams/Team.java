package me.Aryanbhai.CcWt.teams;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

import me.Aryanbhai.CcWt.getgui.mayours;

public class Team {
	private static List<String> teamlola = new ArrayList<String>();
	private static List<String> teamanita = new ArrayList<String>();
	private static List<String> teamsemigod = new ArrayList<String>();
	
	public static void addToTeam(TeamType type, Player player) {
		switch (type) {
		case lola:
			teamlola.add(player.getName());
			break;
		case anita:
			teamanita.add(player.getName());
			break;
		case semigod:
			teamsemigod.add(player.getName());
		}
	}
	public static boolean isInTeamLola(Player player) {
		return teamlola.contains(player.getName());
	}
	public static boolean isInTeamAnita(Player player) {
		return teamanita.contains(player.getName());
	}
	public static boolean isInTeamSemiGod(Player player) {
		return teamsemigod.contains(player.getName());
	}
	public static void clearTeams() {
		teamlola.clear();
		teamanita.clear();
		mayours.claerVotes();
	}
	public static void checkTeam(Player p) {
		if (teamlola.contains(p.getName())) {
			p.sendMessage(p + "has voted to lola");
		}
		if (teamanita.contains(p.getName())) {
			p.sendMessage(p + "has voted to anita");
		}
		else {
			p.sendMessage("This player hasnt voted");
		}
	}
	public static void removeFromTeam(TeamType type,String name) {
		switch (type) {
		case semigod:
			teamsemigod.remove(name);
			break;
		case anita:
			teamanita.remove(name);
			break;
		case lola:
			teamlola.remove(name);
			break;
		}
	}
}
