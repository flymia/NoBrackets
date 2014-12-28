package com.flymia.NoBrackets.base;

import java.io.IOException;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.flymia.NoBrackets.listener.ChatListener;

public class NoBrackets extends JavaPlugin {

	public static String prefix = "§3[NoBrackets]§a ";
	
	
	public void onEnable(){
		System.out.println("NoBrackets v" + this.getDescription().getVersion() + " is active now!");
		
		
		try {
			Metrics metrics = new Metrics(this); metrics.start();
			} catch (IOException e) {
				// Failed to submit the stats :-(
			System.out.println("Error Submitting stats!");
		}
		register();
	}
	
	public void onDisable(){
		System.out.println("NoBrackets v" + this.getDescription().getVersion() + " is unactive now!");
	}
	
	public void register(){
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new ChatListener(), this);
	}
}

