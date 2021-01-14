package com.blockeyhockey.utils.debugger;

import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

/**
 * All of the {@link DebugMessage} types.
 * @author harvanchik
 * @since 01-12-2021
 */
public enum DebugMessage {

    INFO("INFO", ChatColor.BLUE),
    SUCCESS("SUCCESS", ChatColor.GREEN),
    WARNING("WARN", ChatColor.YELLOW),
    ERROR("ERROR", ChatColor.RED);

    private final String label;
    private final ChatColor color;

    DebugMessage(@NotNull final String label, @NotNull final ChatColor color) {
        this.label = label;
        this.color = color;
    }

    /**
     * Get the {@link DebugMessage}'s label.
     * @return The {@link DebugMessage}'s label.
     */
    public String getLabel() {
        return label;
    }

    /**
     * Get the {@link DebugMessage}'s color.
     * @return The {@link DebugMessage}'s color.
     */
    public ChatColor getColor() {
        return color;
    }
}
