package com.blockeyhockey.utils.debugger;

import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

/**
 * All of the {@link DebugMessage} types for the {@link Debugger}.
 * @author harvanchik
 * @since 01-12-2021
 */
public enum DebugMessage {

    /**
     * A message to provide information about something that happened.
     */
    INFO("INFO", ChatColor.BLUE),

    /**
     * A message to indicate a successful action or that the code successfully reached a point.
     */
    SUCCESS("SUCCESS", ChatColor.GREEN),

    /**
     * A message to warn that something has gone wrong or that code was reached that should not have been.
     */
    WARNING("WARN", ChatColor.YELLOW),

    /**
     * A message to indicate that an error occurred, usually placed in a catch statement.
     */
    ERROR("ERROR", ChatColor.RED);

    private final String label;         // the label is displayed in front of the debug message
    private final ChatColor color;      // the color of the label and message text

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
     * Get the {@link DebugMessage}'s {@link ChatColor}.
     * @return The {@link DebugMessage}'s {@link ChatColor}.
     */
    public ChatColor getColor() {
        return color;
    }
}
