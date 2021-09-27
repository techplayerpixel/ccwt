package me.Aryanbhai.CcWt.getgui;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import me.Aryanbhai.CcWt.customitems.itemsop;

public class guiclickevent implements Listener{
	@EventHandler
	public void clickevent(InventoryClickEvent e) {
		
		Player p = (Player) e.getWhoClicked();
		
		if (e.getClickedInventory().getTitle().equals(ChatColor.GRAY + "Get Items")) {
			
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Aspect of the end")) {
				p.getInventory().addItem(itemsop.Aote);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Golem sword")) {
				p.getInventory().addItem(itemsop.Golem);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Ember rod")) {
				p.getInventory().addItem(itemsop.EmberRod);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Magical Mushroom Soup")) {
				p.getInventory().addItem(itemsop.flyingsoup);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Grappling hook")) {
				p.getInventory().addItem(itemsop.GrapplingHook);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Hurricane Bow")) {
				p.getInventory().addItem(itemsop.Hurricanebow);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Mercenary Axe")) {
				p.getInventory().addItem(itemsop.Maxe);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Silver Fang")) {
				p.getInventory().addItem(itemsop.silverfang);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Treecapitator")) {
				p.getInventory().addItem(itemsop.Tc);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "Butcher axe")) {
				p.getInventory().addItem(itemsop.Taxe);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aHoe of Greater Tilling")) {
				p.getInventory().addItem(itemsop.greaterhoe);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aHoe of Great Tilling")) {
				p.getInventory().addItem(itemsop.greathoe);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Cactus Knife")) {
				p.getInventory().addItem(itemsop.cactusknife);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aSweet Axe")) {
				p.getInventory().addItem(itemsop.sweetaxe);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Pigman Sword")) {
				p.getInventory().addItem(itemsop.pigman);
			}
			if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Emerald Blade")) {
				p.getInventory().addItem(itemsop.EmeraldBlade);
			}
			
			e.setCancelled(true);
		}
	}
}
