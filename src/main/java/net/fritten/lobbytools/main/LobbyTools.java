package net.fritten.lobbytools.main; 

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.fritten.lobbytools.events.PlayerEventListener; 

public class LobbyTools extends JavaPlugin { 
	private static LobbyTools instance;
	
	@Override
    public void onDisable() {
        super.onDisable();
        getLogger().info(this.getName() + "disabled successfully!");
    }

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(new PlayerEventListener(), this);
        
        getLogger().info(this.getName() + "enabled successfully!");
    }
    
    @Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) { 
		if (command.getName().equalsIgnoreCase("anchor")) {
			//add player to anchored list
		}
		//if (command.getName().equalsIgnoreCase("fly")){
			//lets player fly n stuff...
		//}
		
		return false; 
	}
    
    
    public static LobbyTools get() {
		return instance;
	}

	public LobbyTools() {
		instance = this;
	}
}
