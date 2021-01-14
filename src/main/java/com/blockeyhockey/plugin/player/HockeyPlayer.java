package com.blockeyhockey.plugin.player;

import com.blockeyhockey.plugin.BlockeyHockey;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * The object that stores all things about a {@link HockeyPlayer}.
 * @author harvanchik
 * @since 01-12-2021
 */
public class HockeyPlayer {

    private final BlockeyHockey plugin;

    private final Player player;

    /**
     * Creates a {@link HockeyPlayer}.
     * @param player The {@link Player} to create the {@link HockeyPlayer} with.
     * @param plugin The plugin's main instance.
     */
    public HockeyPlayer(@NotNull final Player player, @NotNull final BlockeyHockey plugin) {
        this.player = player;
        this.plugin = plugin;
    }

    /**
     * Get the {@link Player} of the {@link HockeyPlayer}.
     * @return The {@link Player}.
     */
    public Player getPlayer() {
        return player;
    }
}
