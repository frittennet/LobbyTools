package net.fritten.lobbyTools.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;
import net.fritten.lobbyTools.LobbyTools;

public class PlayerEventListener implements Listener {
	
	//@EventHandler
	//public void onPlayerMoveEvent(PlayerMoveEvent event){
		//check if player is in anchored list... 
		//event.setCancelled(true);
	//}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event){
		Player player = event.getPlayer();
		player.teleport(LobbyTools.spawnpoint);
		if(player.hasPermission("lobbytools.fly")){
			player.setAllowFlight(true);
		}
	}
}
