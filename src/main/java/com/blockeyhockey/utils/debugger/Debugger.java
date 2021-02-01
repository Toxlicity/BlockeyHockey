package com.blockeyhockey.utils.debugger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;
import app.ashcon.intake.Command;

/**
 * The {@link Debugger} has methods that will print out debug messages to chat and/or the server console.
 * It makes debugging easier and can be toggled on and off.
 * @author harvanchik
 * @since 01-12-2021
 */
public class Debugger {

    private static boolean isDebug;

    /**
     * Send an informative debug message in the chat and console.
     * @param message The debug message.
     */
    public static void debug(@NotNull final String message) {
        debug(message, DebugMessage.INFO);
    }

    /**
     * Send an informative debug message in the chat and console.
     * @param message The debug message.
     * @param type The debug message type.
     */
    public static void debug(@NotNull final String message, @NotNull final DebugMessage type) {
        Bukkit.broadcastMessage(ChatColor.BOLD + "" +
                ChatColor.GRAY + "[" + type.getColor() + type.getLabel() + ChatColor.GRAY + "] "
                 + type.getColor() + message);
        if (Bukkit.getOnlinePlayers().isEmpty()) {
            Debugger.console(message, type);
        }
    }

    /**
     * Send an informative debug message in console.
     * @param message The debug message.
     */
    public static void console(@NotNull final String message) {
        console(message, DebugMessage.INFO);
    }

    /**
     * Send an informative debug message in the console.
     * @param message The debug message.
     * @param type The debug message type.
     */
    public static void console(@NotNull final String message, @NotNull final DebugMessage type) {
        System.out.println(ChatColor.BOLD + "" +
                ChatColor.GRAY + "[" + type.getColor() + type.getLabel() + ChatColor.GRAY + "] "
                 + type.getColor() + message);
    }

    /**
     * Toggle the debug status. It will become the opposite of what it currently is.
     * @return The new status of the {@link Debugger}.
     */
    public static boolean toggleDebug() {
        isDebug = !isDebug;
        debug("Debugger is now " + (isDebug ? "enabled" : "disabled") + "!", DebugMessage.INFO);
        return isDebug;
    }
}