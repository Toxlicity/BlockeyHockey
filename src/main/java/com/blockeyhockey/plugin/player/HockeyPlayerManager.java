package com.blockeyhockey.plugin.player;

import com.blockeyhockey.plugin.BlockeyHockey;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.UUID;

public class HockeyPlayerManager {

    private final BlockeyHockey plugin;

    private HashMap<UUID, HockeyPlayer> hockeyPlayers;

    /**
     * Create the hockey player manager.
     * @param plugin The plugin's main instance.
     */
    public HockeyPlayerManager(@NotNull final BlockeyHockey plugin) {
        this.plugin = plugin;
        this.hockeyPlayers = new HashMap<>();
    }

    /**
     * Create and store hockey player in the hockey player manager.
     * @param player The player to create a hockey player for.
     */
    public void createHockeyPlayer(@NotNull final Player player) {
        hockeyPlayers.put(player.getUniqueId(), new HockeyPlayer(player, plugin));
    }
}
