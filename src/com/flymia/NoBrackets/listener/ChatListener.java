package com.flymia.NoBrackets.listener;

import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class ChatListener implements Listener {

	@EventHandler(priority = EventPriority.MONITOR)
	public void onChat(AsyncPlayerChatEvent e){
		e.setFormat("%1$s : §f%2$s");
	}
}
