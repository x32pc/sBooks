package com.x32pc.github;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class ReloadCommand implements CommandExecutor, TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(args.length == 0){
            sender.sendMessage(ChatColor.RED + "Correct use is /sbooks reload");
        } else if (args.length == 1) {
            if (sender.hasPermission("sbooks.reload")) {
                if (args[0].equalsIgnoreCase("reload")) {
                    Main.plugin.reloadConfig();
                    sender.sendMessage(ChatColor.GREEN + "Config has been reloaded");

                } else {
                    sender.sendMessage(ChatColor.RED + "Correct use is /sbooks reload");
                }
            }
        }

        return false;
    }


@Override
    public List<String> onTabComplete (CommandSender sender, Command command, String s, String[]args){
        List<String> completions = new ArrayList<>();
        if (args.length == 1) {
            completions.add("reload");
            return StringUtil.copyPartialMatches(args[0], completions, new ArrayList<>());
        }
        return null;
    }
}
