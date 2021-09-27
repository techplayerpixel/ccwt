package me.Aryanbhai.CcWt;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.Aryanbhai.CcWt.Gh.GrapplingHook;
import me.Aryanbhai.CcWt.Gh.ghcooldown;
import me.Aryanbhai.CcWt.aotesword.aotesword;
import me.Aryanbhai.CcWt.customaxes.sweetaxe;
import me.Aryanbhai.CcWt.customhoes.cactusknife;
import me.Aryanbhai.CcWt.customhoes.greattillinghoe;
import me.Aryanbhai.CcWt.customitems.itemsop;
import me.Aryanbhai.CcWt.emberrod.EmberRod;
import me.Aryanbhai.CcWt.flysoup.flysoup;
import me.Aryanbhai.CcWt.getgui.guiclickevent;
import me.Aryanbhai.CcWt.givecmd.givecmd;
import me.Aryanbhai.CcWt.golem.golem;
import me.Aryanbhai.CcWt.hurricanebow.hurricanebow;
import me.Aryanbhai.CcWt.taxe.taxe;
import me.Aryanbhai.CcWt.tc.tc;

public class Main extends JavaPlugin implements Listener{
	
	@Override
    public void onEnable() {
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
        itemsop.init();
        this.getCommand("ccwtgui").setExecutor(new givecmd());
        ghcooldown.setupCooldown();
        
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
    }
	
	@Override
	public void onDisable() {
		
	}
}
