package me.Aryanbhai.CcWt;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import me.Aryanbhai.CcWt.Gh.GrapplingHook;
import me.Aryanbhai.CcWt.Gh.ghcooldown;
import me.Aryanbhai.CcWt.aotesword.aotesword;
import me.Aryanbhai.CcWt.createnpc.Npcsummoncmd;
import me.Aryanbhai.CcWt.createnpc.PacketReader;
import me.Aryanbhai.CcWt.createnpc.npcClick;
import me.Aryanbhai.CcWt.createnpc.onJoin;
import me.Aryanbhai.CcWt.createnpc.treasurehunter;
import me.Aryanbhai.CcWt.customanvil.anvil;
import me.Aryanbhai.CcWt.customaxes.sweetaxe;
import me.Aryanbhai.CcWt.customhoes.cactusknife;
import me.Aryanbhai.CcWt.customhoes.greattillinghoe;
import me.Aryanbhai.CcWt.customitems.itemsop;
import me.Aryanbhai.CcWt.custompotions.semigod;
import me.Aryanbhai.CcWt.dataconfig.DataManager;
import me.Aryanbhai.CcWt.emberrod.EmberRod;
import me.Aryanbhai.CcWt.enchanting.customenchantingtable;
import me.Aryanbhai.CcWt.flysoup.flysoup;
import me.Aryanbhai.CcWt.getgui.guiclickevent;
import me.Aryanbhai.CcWt.getgui.mayours;
import me.Aryanbhai.CcWt.givecmd.givecmd;
import me.Aryanbhai.CcWt.golem.golem;
import me.Aryanbhai.CcWt.hurricanebow.hurricanebow;
import me.Aryanbhai.CcWt.mobspawn.gravyard;
import me.Aryanbhai.CcWt.npc_menus.mayourlola;
import me.Aryanbhai.CcWt.npc_menus.npcRank;
import me.Aryanbhai.CcWt.pumpking.pb_axe;
import me.Aryanbhai.CcWt.taxe.taxe;
import me.Aryanbhai.CcWt.tc.tc;

public class Main extends JavaPlugin implements Listener{
	
	public static DataManager data;
	
	@Override
    public void onEnable() {
		data = new DataManager(this);
		System.out.print("[CcWt]" +"Plugin made for Codercraft");
		System.out.print("[CcWt]" + "Loaded Successfully!");
        Bukkit.getPluginManager().registerEvents((Listener)new aotesword(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new golem(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new hurricanebow(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new taxe(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new EmberRod(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new GrapplingHook(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new tc(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new guiclickevent(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new flysoup(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new greattillinghoe(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new cactusknife(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new sweetaxe(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new pb_axe(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new semigod(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new customenchantingtable(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new gravyard(this), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new mayours(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new onJoin(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new npcClick(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new anvil(this), (Plugin)this);
        if (data.getConfig().contains("data")) {
        	loadNPC();
        }
        itemsop.init();
        this.getCommand("ccwtgui").setExecutor(new givecmd());
        this.getCommand("npcrank").setExecutor(new npcRank());
        this.getCommand("setzom1").setExecutor(new gravyard(this));
        this.getCommand("setzom2").setExecutor(new gravyard(this));
        this.getCommand("setzom3").setExecutor(new gravyard(this));
        this.getCommand("setzom4").setExecutor(new gravyard(this));
        this.getCommand("setzom5").setExecutor(new gravyard(this));
        this.getCommand("setzom6").setExecutor(new gravyard(this));
        this.getCommand("setzom7").setExecutor(new gravyard(this));
        this.getCommand("mlola").setExecutor(new mayourlola());
        this.getCommand("manita").setExecutor(new mayourlola());
        this.getCommand("startzomspawn").setExecutor(new gravyard(this));
        this.getCommand("clearTeams").setExecutor(new mayourlola());
        this.getCommand("getplayerteam").setExecutor(new mayourlola());
        this.getCommand("Clearvotes").setExecutor(new mayourlola());
        this.getCommand("checkvotes").setExecutor(new mayourlola());
        this.getCommand("countvotes").setExecutor(new mayourlola());
        this.getCommand("npccreate").setExecutor(new Npcsummoncmd());
        this.getCommand("stopzomspawn").setExecutor(new gravyard(this));
        
        ghcooldown.setupCooldown();
        
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
        if (!Bukkit.getOnlinePlayers().isEmpty()) {
        	for(Player player : Bukkit.getOnlinePlayers()) {
        		PacketReader reader = new PacketReader();
        		reader.unInject(player);
        	}
        }
    }
	
	@Override
	public void onDisable() {
		for(Player player : Bukkit.getOnlinePlayers()) {
    		PacketReader reader = new PacketReader();
    		reader.inject(player);
    		data.getConfig().getBoolean("");
    	}
	}
	public static FileConfiguration getData() {
		return data.getConfig();
	}
	public static void saveData() {
		data.saveconfig();
	}
	public void loadNPC() {
		FileConfiguration file = data.getConfig();
		file.getConfigurationSection("data").getKeys(false).forEach(npc ->{
			Location location = new Location(Bukkit.getWorld(file.getString("data." + npc + ".World")),
					file.getInt("data." + npc + ".X"),file.getInt("data." + npc + ".Y"),file.getInt("data." + npc + ".Z"));
			location.setPitch((float) file.getDouble("data." + npc + ".Pitch"));
			location.setYaw((float) file.getDouble("data." + npc + ".Yaw"));
			String name = file.getString("data." + npc + ".Name");
			GameProfile gameprofile = new GameProfile(UUID.randomUUID(),name);
			gameprofile.getProperties().put("textures", new Property("textures",file.getString("data." + npc + ".text"),
					file.getString("data." + npc + ".signature")));
			treasurehunter.loadNPC(location, gameprofile); 
		});
	}
}