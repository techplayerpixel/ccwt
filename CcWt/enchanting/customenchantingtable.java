package me.Aryanbhai.CcWt.enchanting;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.tr7zw.nbtapi.NBTItem;
import me.Aryanbhai.CcWt.Main;
import me.Aryanbhai.CcWt.Utils;
import me.Aryanbhai.CcWt.customitems.itemsop;

public class customenchantingtable implements Listener{
	Main plugin;
	public customenchantingtable(Main plugin) {
		this.plugin = plugin;
	}
	@EventHandler
    public void onInvClose(final InventoryCloseEvent e) {
        if (e.getView().getTitle().equals("Enchant Item") && e.getInventory().getItem(19) != null) {
            if (e.getPlayer().getInventory().firstEmpty() != -1) {
                e.getPlayer().getInventory().addItem(new ItemStack[] { e.getInventory().getItem(19) });
            }
            else {
                e.getPlayer().getLocation().getWorld().dropItem(e.getPlayer().getLocation(), e.getInventory().getItem(19));
            }
        }
    }
	private ItemStack addDoNotMoveTag(final ItemStack is) {
        final NBTItem nbt = new NBTItem(is);
        nbt.setString("donotmove", "lol");
        return nbt.getItem();
    }
	@EventHandler
	public void enchantingtableopen(final InventoryOpenEvent e) {
		String trueorfalse = Utils.chat(plugin.getConfig().getString("Use_cctable"));
		if (trueorfalse.equalsIgnoreCase("true")) {
			if (e.getInventory().getType().equals((Object)InventoryType.ENCHANTING)) {
				Player p = (Player) e.getPlayer();
				e.setCancelled(true);
				final Inventory enchantment = Bukkit.createInventory((InventoryHolder)null, 54, "Enchant Item");
				ItemStack gray = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
				final ItemMeta stained_glass_meta = gray.getItemMeta();
				stained_glass_meta.setDisplayName(" ");
				gray.setItemMeta(stained_glass_meta);
				gray = this.addDoNotMoveTag(gray);
				for (int slot = 0; slot < 54; ++slot) {
	                enchantment.setItem(slot, gray);
	            }
				enchantment.setItem(19, (ItemStack)null);
				ItemStack enchantitem = new ItemStack(Material.ENCHANTMENT_TABLE);
				final ItemMeta ime = enchantitem.getItemMeta();
				ime.setDisplayName("§aEnchant Item");
				final ArrayList<String> loree = new ArrayList<String>();
				loree.add("§7Add an item to the slot above to");
				loree.add("§7to view enchantment options!");
				ime.setLore((List<String>)loree);
				enchantitem.setItemMeta(ime);
				enchantitem = this.addDoNotMoveTag(enchantitem);
				enchantment.setItem(28, enchantitem);
				ItemStack close = new ItemStack(Material.BARRIER);
				final ItemMeta closemeta = close.getItemMeta();
				closemeta.setDisplayName("§cClose");
				close.setItemMeta(closemeta);
				close = this.addDoNotMoveTag(close);
				enchantment.setItem(49, close);
				ItemStack clay = new ItemStack(Material.INK_SACK, 1, (short)8);
				final ItemMeta im = clay.getItemMeta();
				im.setDisplayName("§cEnchant Item");
				final ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Place an item in the open slot");
				lore.add("§7to enchant it!");
				im.setLore((List<String>)lore);
				clay.setItemMeta(im);
				clay = this.addDoNotMoveTag(clay);
				enchantment.setItem(23, clay);
				p.openInventory(enchantment);
		    }
		}
	}
	@EventHandler
	public void Invclick(InventoryClickEvent e) {
		if (e.getClickedInventory().getTitle().equals("Enchant Item")) {
			Player p = (Player) e.getWhoClicked();
			if (e.getCurrentItem().getType() != Material.STAINED_GLASS_PANE && e.getCurrentItem().getType() != Material.BARRIER && e.getCurrentItem().getType() != Material.ENCHANTMENT_TABLE && e.getCurrentItem().getType() != Material.INK_SACK && e.getCurrentItem().getType() != Material.ENCHANTED_BOOK) {
				p.getInventory().addItem(e.getCurrentItem());
				e.getClickedInventory().setItem(19, null);
				ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)15);
				ItemMeta meta = glass.getItemMeta();
				meta.setDisplayName("§f");
				glass.setItemMeta(meta);
				ItemStack clay = new ItemStack(Material.INK_SACK, 1, (short)8);
				ItemMeta im = clay.getItemMeta();
				im.setDisplayName("§cEnchant Item");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Place an item in the open slot");
				lore.add("§7to enchant it!");
				im.setLore((List<String>)lore);
				clay.setItemMeta(im);
				e.getInventory().setItem(11, glass);
				e.getInventory().setItem(12, glass);
				e.getInventory().setItem(23, clay);
			}
			if (e.getCurrentItem().getType().equals(Material.INK_SACK)) {
				if (e.getClickedInventory().getItem(19) != null) {
					if (e.getClickedInventory().getItem(19).getType().equals(Material.WOOD_SWORD)
							|| e.getInventory().getItem(19).getType().equals(Material.STONE_SWORD)
							|| e.getInventory().getItem(19).getType().equals(Material.IRON_SWORD)
							|| e.getInventory().getItem(19).getType().equals(Material.GOLD_SWORD)
							|| e.getInventory().getItem(19).getType().equals(Material.DIAMOND_SWORD)) {
						ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)15);
						ItemMeta meta = glass.getItemMeta();
						meta.setDisplayName("§f");
						glass.setItemMeta(meta);
						e.getInventory().setItem(11, itemsop.sharpnessmain);
						e.getInventory().setItem(12, itemsop.fireaspect2main);
						e.getInventory().setItem(23, glass);
					}
				}
			}
			if (e.getCurrentItem().equals(itemsop.sharpnessmain)) {
				ItemMeta meta = e.getCurrentItem().getItemMeta();
				ArrayList<String> finalLore = new ArrayList<String>();
				for (String line : new ArrayList<String>(e.getCurrentItem().getItemMeta().getLore())) {
					if (e.getCurrentItem().getItemMeta().getLore().contains(" ")) {
						line.replace(" ", ("  "+"Telekinesis I"+" "));
						finalLore.add(line);
						meta.setLore(finalLore);
						e.getCurrentItem().setItemMeta(meta);
					}
				}
			}
			if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
				p.closeInventory();
			}
		}
	}
}
