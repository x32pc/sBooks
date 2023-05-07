package com.x32pc.github;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class BookCreation {
    static String messageFinal = "";

    public static ItemStack getBook() {
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta meta = (BookMeta) book.getItemMeta();
        assert meta != null;
        for (String message : Main.plugin.getConfig().getStringList("book_on_join.text")) {
            message = message + "\n";
            messageFinal = messageFinal + message;
        }
        meta.addPage(ChatColor.translateAlternateColorCodes('&', messageFinal));
        messageFinal = "";
        meta.setAuthor("console");
        meta.setTitle("console");
        book.setItemMeta(meta);
        return book;
    }




}
