package fr.minzord.fly;

import org.bukkit.plugin.java.JavaPlugin;

import fr.minzord.fly.commands.CommandsFly;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		getCommand("fly").setExecutor(new CommandsFly(this));
	}

}
