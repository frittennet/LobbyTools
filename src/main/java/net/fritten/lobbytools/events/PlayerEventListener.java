package net.fritten.lobbytools.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerEventListener implements Listener {
	
	//@EventHandler
	//public void onPlayerMoveEvent(PlayerMoveEvent event){
		//check if player is in anchored list... 
		//event.setCancelled(true);
	//}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event){
		if(event.getPlayer().hasPermission("lobbytools.fly")){
			event.getPlayer().setAllowFlight(true);
		}
	}
}
