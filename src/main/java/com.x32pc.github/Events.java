package com.x32pc.github;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if(Main.plugin.getConfig().getBoolean("book_on_join.enabled")) {

            event.getPlayer().openBook(BookCreation.getBook());
        }
        if(Main.plugin.getConfig().getBoolean("message_on_join.enabled")) {
        for (String message : Main.plugin.getConfig().getStringList("message_on_join.message")) {
        event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        }
        }
    }
}
