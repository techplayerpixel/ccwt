package me.Aryanbhai.CcWt.dataconfig;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.Aryanbhai.CcWt.Main;

public class DataManager {
	
	private Main plugin;
	private FileConfiguration dataconfig = null;
	private File configfile = null;
	
	public DataManager(Main plugin) {
		this.plugin = plugin;
		saveDeafaultConfig();
	}
	public void reloadconfig() {
		if (this.configfile == null) {
			this.configfile = new File(this.plugin.getDataFolder(),"data.yml");
		}
		this.dataconfig = YamlConfiguration.loadConfiguration(this.configfile);
		
		InputStream defaultstream = this.plugin.getResource("data.yml");
		
		if (defaultstream != null) {
			YamlConfiguration defaultconfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defaultstream));
			this.dataconfig.setDefaults(defaultconfig);
		}
		
	}
	public FileConfiguration getConfig() {
		if (this.dataconfig == null)
			reloadconfig();
		return this.dataconfig;
	}
	public void saveconfig() {
		if (this.dataconfig == null || this.configfile == null)
			return;
		try {
			this.getConfig().save(this.configfile);
		} catch (IOException e) {
			plugin.getLogger().log(Level.SEVERE,"could not save config to" + this.configfile,e);
		}
	}
	public void saveDeafaultConfig() {
		if (this.configfile == null) {
			this.configfile = new File(this.plugin.getDataFolder(),"data.yml");
		}
		if (!this.configfile.exists()) {
			this.plugin.saveResource("data.yml", false);
		}
	}
}
