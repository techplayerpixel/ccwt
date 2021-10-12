package me.Aryanbhai.CcWt.custompotions;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.Aryanbhai.CcWt.Main;
import me.Aryanbhai.CcWt.teams.Team;
import me.Aryanbhai.CcWt.teams.TeamType;

public class semigod implements Listener{
	Main plugin;
	public semigod(Main plugin) {
		this.plugin = plugin;
	}
	@EventHandler
	public void consume(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand().getItemMeta().getDisplayName() == "§aSemi god potion") {
			if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
				if (!Team.isInTeamSemiGod(p)) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,72000,4));
					p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,72000,4));
					p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING,72000,3));
					p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,72000,4));
					p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION,72000,4));
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,72000,4));
					p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,72000,3));
					p.getInventory().removeItem(p.getInventory().getItemInHand());
					Team.addToTeam(TeamType.semigod, p);
					Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
						@Override
						public void run() {
							p.removePotionEffect(PotionEffectType.SPEED);
							p.removePotionEffect(PotionEffectType.JUMP);
							p.removePotionEffect(PotionEffectType.FAST_DIGGING);
							p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
							p.removePotionEffect(PotionEffectType.ABSORPTION);
							p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
							p.removePotionEffect(PotionEffectType.NIGHT_VISION);
							Team.removeFromTeam(TeamType.semigod, p.getName());
						}
					},72000);
				}
				if (Team.isInTeamSemiGod(p)) {
					p.sendMessage("§cYou already have active potion effects!");
				}
			}
		}
	}
}
