package me.Aryanbhai.CcWt.customanvil;

import java.util.ArrayList;

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

import me.Aryanbhai.CcWt.Main;
import me.Aryanbhai.CcWt.Utils;

public class anvil implements Listener{
	Main plugin;
	public anvil(Main plugin) {
		this.plugin = plugin;
	}
	@EventHandler
	public void onInvClose(InventoryCloseEvent e) {
		if (e.getInventory().getTitle().equalsIgnoreCase("Anvil")) {
			if (e.getInventory().getItem(29)!= null) {
				if (e.getPlayer().getInventory().firstEmpty() != -1) {
	                e.getPlayer().getInventory().addItem(new ItemStack[] { e.getInventory().getItem(29) });
	            }
				else {
	                e.getPlayer().getLocation().getWorld().dropItem(e.getPlayer().getLocation(), e.getInventory().getItem(29));
	            }
			}
			if (e.getInventory().getItem(33)!= null) {
				if (e.getPlayer().getInventory().firstEmpty() != -1) {
	                e.getPlayer().getInventory().addItem(new ItemStack[] { e.getInventory().getItem(33) });
	            }
				else {
	                e.getPlayer().getLocation().getWorld().dropItem(e.getPlayer().getLocation(), e.getInventory().getItem(33));
	            }
			}
		}
	}
	@EventHandler
	public void onAnvilOpen(InventoryOpenEvent e) {
		String trueorfalse = Utils.chat(plugin.getConfig().getString("Use_Anvil"));
		if (trueorfalse.equalsIgnoreCase("true")) {
			if (e.getInventory().getType().equals((Object)InventoryType.ANVIL)) {
				Player p = (Player) e.getPlayer();
				e.setCancelled(true);
				Inventory anvilgui = Bukkit.createInventory((InventoryHolder)null, 54,"Anvil");
				ItemStack gray = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
				ItemMeta stained_glass_meta = gray.getItemMeta();
				stained_glass_meta.setDisplayName("§f");
				gray.setItemMeta(stained_glass_meta);
				for (int slot = 0; slot < 54; ++slot) {
	                anvilgui.setItem(slot, gray);
	            }
				anvilgui.setItem(29, (ItemStack)null);
				anvilgui.setItem(33, (ItemStack)null);
				ItemStack close = new ItemStack(Material.BARRIER);
				ItemMeta closemeta = close.getItemMeta();
				closemeta.setDisplayName("§cClose");
				close.setItemMeta(closemeta);
				anvilgui.setItem(49, close);
				ItemStack anvil = new ItemStack(Material.BARRIER);
				ItemMeta anvilmeta = anvil.getItemMeta();
				anvilmeta.setDisplayName("§cAnvil");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Place a target item in the left");
				lore.add("§7lot and a sacrafice item in the");
				lore.add("§7right slot to combine.");
      			lore.add("§7Enchantments!");
				anvilmeta.setLore(lore);
				anvil.setItemMeta(anvilmeta);
				anvilgui.setItem(13, anvil);
				ItemStack red = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
				ItemMeta stained_glass_meta2 = gray.getItemMeta();
				stained_glass_meta2.setDisplayName("§f");
				red.setItemMeta(stained_glass_meta2);
				anvilgui.setItem(45, red);
				anvilgui.setItem(46, red);
				anvilgui.setItem(47, red);
				anvilgui.setItem(48, red);
				anvilgui.setItem(50, red);
				anvilgui.setItem(51, red);
				anvilgui.setItem(52, red);
				anvilgui.setItem(53, red);
				ItemStack combine = new ItemStack(Material.ANVIL);
				ItemMeta combinemeta = combine.getItemMeta();
				combinemeta.setDisplayName("§aCombine Items");
				ArrayList<String> lore2 = new ArrayList<String>();
				lore2.add("§7Combine items in the");
				lore2.add("§7slots to the right and left");
				lore2.add("§7below.");
				combinemeta.setLore(lore2);
				combine.setItemMeta(combinemeta);
				anvilgui.setItem(22,combine);
				ItemStack red2 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
				ItemMeta red2meta = red2.getItemMeta();
				red2meta.setDisplayName("§6Item to Upgrade");
				ArrayList<String> lorered2 = new ArrayList<String>();
				lorered2.add("§7The item you want to");
				lorered2.add("§7upgrade should be placed in");
				lorered2.add("§7the slot on this side.");
				red2meta.setLore(lorered2);
				red2.setItemMeta(red2meta);
				anvilgui.setItem(11, red2);
				anvilgui.setItem(12, red2);
				anvilgui.setItem(20, red2);
				ItemStack red3 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
				ItemMeta red3meta = red3.getItemMeta();
				red3meta.setDisplayName("§6Item to Sacrafice");
				ArrayList<String> lorered3 = new ArrayList<String>();
				lorered3.add("§7The item you are");
				lorered3.add("§7sacraficing in order to");
				lorered3.add("§7upgrade the item on the");
				lorered3.add("§7left should be placed in");
				lorered3.add("§7the slot on this side.");
				red3meta.setLore(lorered3);
				red3.setItemMeta(red3meta);
				anvilgui.setItem(14, red3);
				anvilgui.setItem(15, red3);
				anvilgui.setItem(24, red3);
				ItemStack checkers = new ItemStack(Material.ENDER_PORTAL_FRAME);
				ItemMeta checkermeta = checkers.getItemMeta();
				checkermeta.setDisplayName("§cCombine Checker");
				ArrayList<String> lorechecker = new ArrayList<String>();
				lorechecker.add("§7Put item above to check");
				lorechecker.add("§7if it can be combined.");
				checkermeta.setLore(lorechecker);
				checkers.setItemMeta(checkermeta);
				anvilgui.setItem(38, checkers);
				anvilgui.setItem(42, checkers);
				p.openInventory(anvilgui);
			}
		}
	}
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().equals("Anvil")) {
			ItemStack ready = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
			ItemMeta meta = ready.getItemMeta();
			meta.setDisplayName("§aReady!");
			ready.setItemMeta(meta);
			ItemStack checked = new ItemStack(Material.EYE_OF_ENDER);
			ItemMeta checkedmeta = checked.getItemMeta();
			checkedmeta.setDisplayName("§aItem can be combined");
			checked.setItemMeta(checkedmeta);
			ItemStack checkers = new ItemStack(Material.ENDER_PORTAL_FRAME);
			ItemMeta checkermeta = checkers.getItemMeta();
			checkermeta.setDisplayName("§cCombine Checker");
			ArrayList<String> lorechecker = new ArrayList<String>();
			lorechecker.add("§7Put item above to check");
			lorechecker.add("§7if it can be combined.");
			checkermeta.setLore(lorechecker);
			checkers.setItemMeta(checkermeta);
			ItemStack cantcombine = new ItemStack(Material.ENDER_PEARL);
			ItemMeta cantcommeta = cantcombine.getItemMeta();
			cantcommeta.setDisplayName("§cItem cant be combined");
			cantcombine.setItemMeta(cantcommeta);
			Player p = (Player) e.getWhoClicked();
			if (e.getCurrentItem().getType() != Material.STAINED_GLASS_PANE && e.getCurrentItem().getType() != Material.BARRIER && 
					e.getCurrentItem().getType() != Material.ANVIL && e.getCurrentItem().getType() != Material.ENDER_PORTAL_FRAME
					&& e.getCurrentItem().getType() != Material.ENDER_PEARL && e.getCurrentItem().getType() != Material.EYE_OF_ENDER) {
				p.getInventory().addItem(e.getCurrentItem());
				e.getClickedInventory().setItem(29, null);
				ItemStack red2 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
				ItemMeta red2meta = red2.getItemMeta();
				red2meta.setDisplayName("§6Item to Upgrade");
				ArrayList<String> lorered2 = new ArrayList<String>();
				lorered2.add("§7The item you want to");
				lorered2.add("§7upgrade should be placed in");
				lorered2.add("§7the slot on this side.");
				red2meta.setLore(lorered2);
				red2.setItemMeta(red2meta);
				e.getInventory().setItem(11, red2);
				e.getInventory().setItem(12, red2);
				e.getInventory().setItem(20, red2);
				ItemStack red3 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
				ItemMeta red3meta = red3.getItemMeta();
				red3meta.setDisplayName("§6Item to Sacrafice");
				ArrayList<String> lorered3 = new ArrayList<String>();
				lorered3.add("§7The item you are");
				lorered3.add("§7sacraficing in order to");
				lorered3.add("§7upgrade the item on the");
				lorered3.add("§7left should be placed in");
				lorered3.add("§7the slot on this side.");
				red3meta.setLore(lorered3);
				red3.setItemMeta(red3meta);
				e.getInventory().setItem(14, red3);
				e.getInventory().setItem(15, red3);
				e.getInventory().setItem(24, red3);
				e.getInventory().setItem(38, checkers);
			}
			if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
				p.closeInventory();
			}
			if (e.getCurrentItem().getType().equals(Material.ENDER_PORTAL_FRAME)) {
				//swords check
				if (e.getInventory().getItem(29) != null) {
					if (e.getInventory().getItem(29).getType() == Material.WOOD_SWORD ||
							e.getInventory().getItem(29).getType() == Material.STONE_SWORD ||
							e.getInventory().getItem(29).getType() == Material.IRON_SWORD ||
							e.getInventory().getItem(29).getType() == Material.GOLD_SWORD ||
					        e.getInventory().getItem(29).getType() == Material.DIAMOND_SWORD){
						e.getInventory().setItem(11, ready);
						e.getInventory().setItem(12, ready);
						e.getInventory().setItem(20, ready);
						e.getInventory().setItem(38, checked);
					}else {
						e.getInventory().setItem(38, cantcombine);
					}
				}
			}
		}
	}
}
