package com.blockeyhockey.utils.debugger;

import org.bukkit.ChatColor;

/**
 * All of the debug message types.
 */
public enum DebugMessage {

    INFO("INFO", ChatColor.BLUE),
    SUCCESS("SUCCESS", ChatColor.GREEN),
    WARNING("WARN", ChatColor.YELLOW),
    ERROR("ERROR", ChatColor.RED);

    private final String label;
    private final ChatColor color;

    DebugMessage(String label, ChatColor color) {
        this.label = label;
        this.color = color;
    }

    /**
     * Get the debug message's label.
     * @return The debug message's label.
     */
    public String getLabel() {
        return label;
    }

    /**
     * Get the debug message's color.
     * @return The debug message's color.
     */
    public ChatColor getColor() {
        return color;
    }
}
