package com.blockeyhockey.utils.debugger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

public class Debugger {

    /**
     * Send an information debug message in the chat and console.
     * @param message The debug message.
     */
    public static void debug(@NotNull final String message) {
        debug(message, DebugMessage.INFO);
    }

    /**
     * Send a debug message in the chat and console.
     * @param message The debug message.
     * @param type The debug message type.
     */
    public static void debug(@NotNull final String message, @NotNull final DebugMessage type) {
        Bukkit.broadcastMessage(
                ChatColor.GRAY + "[" + type.getColor() + type.getLabel() + ChatColor.GRAY + "] "
                 + ChatColor.RESET + message);
    }

    /**
     * Send an information debug message in console.
     * @param message The debug message.
     */
    public static void console(@NotNull final String message) {
        console(message, DebugMessage.INFO);
    }

    /**
     * Send a debug message in the console.
     * @param message The debug message.
     * @param type The debug message type.
     */
    public static void console(@NotNull final String message, @NotNull final DebugMessage type) {
        System.out.println(
                ChatColor.GRAY + "[" + type.getColor() + type.getLabel() + ChatColor.GRAY + "] "
                 + ChatColor.RESET + message);
    }
}