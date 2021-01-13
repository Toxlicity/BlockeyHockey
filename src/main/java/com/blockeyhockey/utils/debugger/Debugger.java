package com.blockeyhockey.utils.debugger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Debugger {

    /**
     * Send an information debug message in the chat and console.
     * @param message The debug message.
     */
    public void debug(String message) {
        debug(message, DebugMessage.INFO);
    }

    /**
     * Send a debug message in the chat and console.
     * @param message The debug message.
     * @param type The debug message type.
     */
    public void debug(String message, DebugMessage type) {
        Bukkit.broadcastMessage(
                ChatColor.GRAY + "[" + type.getColor() + type.getLabel() + ChatColor.GRAY + "] "
                 + ChatColor.RESET + message);
    }

    /**
     * Send an information debug message in console.
     * @param message The debug message.
     */
    public void console(String message) {
        console(message, DebugMessage.INFO);
    }

    /**
     * Send a debug message in the console.
     * @param message The debug message.
     * @param type The debug message type.
     */
    public void console(String message, DebugMessage type) {
        System.out.println(
                ChatColor.GRAY + "[" + type.getColor() + type.getLabel() + ChatColor.GRAY + "] "
                 + ChatColor.RESET + message);
    }
}

