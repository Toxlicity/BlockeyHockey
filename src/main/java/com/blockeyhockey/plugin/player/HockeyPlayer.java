package com.blockeyhockey.plugin.player;

import com.blockeyhockey.plugin.BlockeyHockey;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HockeyPlayer {

    private final BlockeyHockey plugin;

    private final Player player;

    /**
     * Creates a hockey player.
     * @param player The Minecraft player to create the hockey player with.
     * @param plugin The plugin's main instance.
     */
    public HockeyPlayer(@NotNull final Player player, @NotNull final BlockeyHockey plugin) {
        this.player = player;
        this.plugin = plugin;
    }
}
