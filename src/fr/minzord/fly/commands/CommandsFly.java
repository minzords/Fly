package fr.minzord.fly.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.minzord.fly.Main;

public class CommandsFly implements CommandExecutor {
	
	private Main main;

	public CommandsFly(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player target;
		
		if (label.equalsIgnoreCase("fly") && sender instanceof Player) {
	         target = (Player)sender;
	         if (target.hasPermission("fly.use")) {
	            if (!target.getAllowFlight()) {
	               target.setAllowFlight(true);
	               target.sendMessage(main.getConfig().getString("messages.fly-success-enable").replaceAll("&", "§"));
	               return false;
	            } else {
	               target.setAllowFlight(false);
	               target.sendMessage(main.getConfig().getString("messages.fly-success-disable").replaceAll("&", "§"));
	               return false;
	            }
	         } else {
	            target.sendMessage(main.getConfig().getString("messages. fly-error").replaceAll("&", "§"));
	            return false;
	         }
	     } else {
	         return false;
	      }
	}

}
