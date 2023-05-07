package com.x32pc.github;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static FileConfiguration config;
    public static Plugin plugin;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        plugin = this;
        getServer().getPluginManager().registerEvents(new Events(), this);
        getCommand("sbooks").setExecutor(new ReloadCommand());
        getCommand("sbooks").setTabCompleter(new ReloadCommand());
    }

    @Override
    public void onDisable() {
    }

}
