package me.Aryanbhai.CcWt.customitems;

import java.util.List;
import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffectType;
public class itemsop {
	
	public static ItemStack Aote;
	public static ItemStack Golem;
	public static ItemStack Hurricanebow;
	public static ItemStack Taxe;
	public static ItemStack EmberRod;
	public static ItemStack GrapplingHook;
	public static ItemStack Tc;
	public static ItemStack flyingsoup;
	public static ItemStack silverfang;
	public static ItemStack Maxe;
	public static ItemStack greaterhoe;
	public static ItemStack greathoe;
	public static ItemStack cactusknife;
	public static ItemStack sweetaxe;
	public static ItemStack pigman;
	public static ItemStack EmeraldBlade;
	public static ItemStack pbaxe;
	public static ItemStack vip;
	public static ItemStack mvp;
	public static ItemStack mvppro;
	public static ItemStack black;
	public static ItemStack semigod;
	public static ItemStack fireaspect2main;
	public static ItemStack fireaspecrt2;
	public static ItemStack fireaspecrt1;
	public static ItemStack sharpnessmain;
	public static ItemStack sharpness;
	public static ItemStack sharpness2;
	public static ItemStack sharpness3;
	public static ItemStack sharpness4;
	public static ItemStack sharpness5;
	public static ItemStack votelola;
	
	public static void init(){
		createaote();
		creategolem();
		createhurricanebow();
		createTaxe();
		createemberrod();
		creategh();
		createtc();
		createsoup();
		createsf();
		createMaxe();
		creategth();
		creategtth();
		createck();
		createsweetaxe();
		createpigman();
		createemblade();
		createpbaxe();
		createvip();
		createmvp();
		createmvppro();
		createblack();
		createsemigod();
		createfire();
		createsharp();
		createlolavote();
	}
	
	private static void createaote() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�9Aspect of the end");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+100");
		lore.add("�7Strength: �c+100");
		lore.add("          ");
		lore.add("�6Item ability: Instant Transmission �e�lRIGHT CLICK");
		lore.add("�7Teleports you�2 8 blocks �7ahead of");
		lore.add("�7you and gain �2speed �7while holding it");
		lore.add("�9Mana cost: �b50");
		lore.add("         ");
		lore.add("�9�lRARE SWORD");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		Aote = item;
	}
	
	private static void creategolem() {
		ItemStack item = new ItemStack(Material.IRON_SWORD,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�9Golem sword");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+80");
		lore.add("�7Strength: �c+125");
		lore.add("    ");
		lore.add("�6Item ability: Iron Punch �e�lRIGHT CLICK");
		lore.add("�7Damages mobs around you");
		lore.add("�7in certian radius");
		lore.add("�9Mana cost: �b70");
		lore.add("         ");
		lore.add("�9�lRARE SWORD");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		Golem = item;
		
	}
	
	private static void createhurricanebow() {
		ItemStack item = new ItemStack(Material.BOW,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�5Hurricane Bow");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+120");
		lore.add("�7Strength: �c+50");
		lore.add("         ");
		lore.add("�6Item ability: Multishot");
		lore.add("�7Shoot �2multiple �7arrows");
		lore.add("�7at once using this bow!");
		lore.add("         ");
		lore.add("�5�lEpic Bow");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		Hurricanebow = item;
	}
	private static void createTaxe() {
		ItemStack item = new ItemStack(Material.IRON_AXE,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�4Butcher axe");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+60");
		lore.add("�7Strength: �c+40");
		lore.add("         ");
		lore.add("�6Item ability: Meat Hunter �e�lRIGHT CLICK");
		lore.add("�7Swing the axe in �2front");
		lore.add("�7you to chop down �2mobs!");
		lore.add("          ");
		lore.add("�9�lRARE AXE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		Taxe = item;
	}
	private static void createemberrod() {
		ItemStack item = new ItemStack(Material.BLAZE_ROD,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�5Ember rod");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+80");
		lore.add("�7Strength: �c+35");
		lore.add("�7Intelligence: �a+50");
		lore.add("         ");
		lore.add("�6Item Ability: Fire Blast �e�lRIGHT CLICK");
		lore.add("�7Shoot fireballs in rapid");
		lore.add("�7succession in front of you!");
		lore.add("�9Mana cost: �b150");
		lore.add("�9CoolDown: 30s");
		lore.add("         ");
		lore.add("�5�lEPIC SWORD");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);;
		EmberRod = item;
		
	}
	private static void creategh() {
		ItemStack item = new ItemStack(Material.FISHING_ROD,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aGrappling hook");
		List<String> lore = new ArrayList<>();
		lore.add("�7Travel in style with this tool...");
		lore.add("�a2 �7seconds cooldown");
		lore.add("         ");
		lore.add("�a�lUNCOMMON");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		GrapplingHook = item;
		
	}
	private static void createtc() {
		ItemStack item = new ItemStack(Material.GOLD_AXE,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�5Treecapitator");
		List<String> lore = new ArrayList<>();
		lore.add("�7A forcefull golden axw which can");
		lore.add("�7break a bunch of logs with a single strike");
		lore.add("         ");
		lore.add("�5�lEPIC AXE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		Tc =item;
	}
	private static void createsoup() {
		ItemStack item = new ItemStack(Material.MUSHROOM_SOUP,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aMagical Mushroom Soup");
		List<String> lore = new ArrayList<>();
		lore.add("�7Gives you ability to fly on your island");
		lore.add("�aUNCOMMON");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS,ItemFlag.HIDE_ATTRIBUTES);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		item.setItemMeta(meta);
		flyingsoup = item;
	}
	private static void createsf() {
		ItemStack item = new ItemStack(Material.GHAST_TEAR,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aSilver Fang");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+100");
		lore.add("       ");
		lore.add("�aUNCOMMON SWORD");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		silverfang = item;
	}
	private static void createMaxe() {
		ItemStack item = new ItemStack(Material.IRON_AXE,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�9Mercenary Axe");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+70");
		lore.add("�7Strength: �c+20");
		lore.add("       ");
		lore.add("�aUNCOMMON AXE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		Maxe = item;
	}
	private static void creategth() {
		ItemStack item = new ItemStack(Material.WOOD_HOE,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aHoe of Greater Tilling");
		List<String> lore = new ArrayList<>();
		lore.add("�7Tills a �95x5 �7area of farmland at a time.");
		lore.add("        ");
		lore.add("�a�lUNCOMMON HOE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		greaterhoe = item;
	}
	private static void creategtth() {
		ItemStack item = new ItemStack(Material.WOOD_HOE,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aHoe of Great Tilling");
		List<String> lore = new ArrayList<>();
		lore.add("�7Tills a �93x3 �7area of farmland at a time.");
		lore.add("        ");
		lore.add("�a�lUNCOMMON HOE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		greathoe = item;
	}
	private static void createck() {
		ItemStack item = new ItemStack(Material.GOLD_HOE,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�5Cactus Knife");
		List<String> lore = new ArrayList<>();
		lore.add("�7Slices through �acactus �7instantly.");
		lore.add("        ");
		lore.add("�5�lEPIC HOE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		cactusknife = item;
	}
	private static void createsweetaxe() {
		ItemStack item = new ItemStack(Material.IRON_AXE,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aSweet Axe");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+25");
		lore.add("        ");
		lore.add("�710% chance of dropping apples");
		lore.add("�7while cuting down logs.");
		lore.add("        ");
		lore.add("�a�lUNCOMMON AXE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		sweetaxe = item;
	}
	private static void createpigman() {
		ItemStack item = new ItemStack(Material.GOLD_SWORD,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�6Pigman Sword");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+200");
		lore.add("�7Strength: �c+100");
		lore.add("�7Crit Chance: �c+5%");
		lore.add("�7Crit Damage: �c+30%");
		lore.add("�7Intelligence: �a+50");
		lore.add(" ");
		lore.add("�6Item Ability: Burning Souls �e�lRIGHT CLICK");
		lore.add("�7Gain �a+300 �7defence for");
		lore.add("�a5s �7and cast vortex of flames");
		lore.add("�7towards enemies, dealing upto");
		lore.add("�c30,000 �7Damage.");
		lore.add("�9Mana cost: �b400");
		lore.add(" ");
		lore.add("�a�lLEGENDARY SWORD");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		pigman = item;
	}
	private static void createemblade() {
		ItemStack item = new ItemStack(Material.EMERALD,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�5Emerald Blade");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+130");
		lore.add("�7A powerful blade made out of");
		lore.add("�7pue �aEmeralds�7.");
		lore.add("        ");
		lore.add("�a�lLEGENDARY SWORD");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		EmeraldBlade = item;
	}
	private static void createpbaxe() {
		ItemStack item = new ItemStack(Material.GOLD_AXE,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�ePumpkin Bomber");
		List<String> lore = new ArrayList<>();
		lore.add("�7Damage: �c+100");
		lore.add("�7Strength: �c+50");
		lore.add("        ");
		lore.add("�6Item Ability: Pumpkin Bombing �e�lRIGHT CLICK");
		lore.add("�aBomb �7your enemies using this");
		lore.add("axe.");
		lore.add("�c�lSPECIAL");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		pbaxe = item;
	}
	private static void createvip() {
		ItemStack item = new ItemStack(Material.PAPER,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aVIP RANK");
		List<String> lore = new ArrayList<>();
		lore.add("�7Items you get:");
		lore.add("�aTreecapitator");
		lore.add("        ");
		lore.add("�6Give you a VIP tag and access to");
		lore.add("�6many commands.");
		lore.add("        ");
		lore.add("�7You will also get extra rewards");
		lore.add("�7and mytery crates!");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		vip = item;
	}
	private static void createmvp() {
		ItemStack item = new ItemStack(Material.PAPER,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aMVP RANK");
		List<String> lore = new ArrayList<>();
		lore.add("�7Items you get:");
		lore.add("�aTreecapitator");
		lore.add("�aGrappling Hook");
		lore.add("        ");
		lore.add("�6Give you a MIP tag and access to");
		lore.add("�6many more commands.");
		lore.add("        ");
		lore.add("�7You will also get more extra rewards");
		lore.add("�7and mytery crates!");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		mvp = item;
	}
	private static void createmvppro() {
		ItemStack item = new ItemStack(Material.PAPER,1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�aVIP RANK");
		List<String> lore = new ArrayList<>();
		lore.add("�7Items you get:");
		lore.add("�aTreecapitator");
		lore.add("        ");
		lore.add("�6Give you a MVP+ tag and access to");
		lore.add("�6many commands.");
		lore.add("        ");
		lore.add("�7You will also get extra rewards");
		lore.add("�7and mytery crates!");
		lore.add("�cAND ACCESEE TO OUR SECRET DISCORD CHANNEL");
		lore.add("�cWHERE U WILL GET ALL LEAKS FIRST AND");
		lore.add("�cU WILL BE ABLE TO TEST THEM UR SELF");
		lore.add("�cBEFORE ANYONE ELSE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		mvppro = item;
	}
	private static void createblack() {
		ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("�f");
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		black = item;
	}
	private static void createsemigod() {
		ItemStack item = new ItemStack(Material.POTION,1);
		PotionMeta meta = (PotionMeta) item.getItemMeta();
		meta.setMainEffect(PotionEffectType.JUMP);
		meta.setDisplayName("�aSemi god potion");
		List<String> lore = new ArrayList<>();
		lore.add("�7Used to get some �aluck effects!");
		lore.add("       ");
		lore.add("�9�lRARE");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ATTRIBUTES);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		semigod = item;
	}
	//Enchantment Books
	private static void createfire() {
		ItemStack item = new ItemStack(Material.ENCHANTED_BOOK,1);
		EnchantmentStorageMeta meta = (EnchantmentStorageMeta) item.getItemMeta();
		meta.setDisplayName("�aFire Aspect II");
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		List<String> lore = new ArrayList<>();
		lore.add("�7Ignites your enemies for �a4s");
		lore.add("�7dealing �a100% �7of your weapon");
		lore.add("�7damage per second.");
		lore.add("        ");
		lore.add("�6Applied to:");
		lore.add("�f - Swords");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		fireaspect2main = item;
	}
	private static void createsharp() {
		ItemStack item = new ItemStack(Material.ENCHANTED_BOOK,1);
		EnchantmentStorageMeta meta = (EnchantmentStorageMeta) item.getItemMeta();
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.setDisplayName("�aSharpness");
		List<String> lore = new ArrayList<>();
		lore.add("�7Increases melee damage");
		lore.add("�7dealing �a100% �7of your weapon");
		lore.add("�7dealt by �a5% �7per level.");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		sharpnessmain = item;
	}
	private static void createlolavote() {
		ItemStack item = new ItemStack(Material.PAPER,1);
		ItemMeta meta = (ItemMeta) item.getItemMeta();
		meta.setDisplayName("Vote!");
		item.setItemMeta(meta);
		votelola = item;
	}
}
