package com.blockeyhockey.plugin.listeners;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.plugin.player.HockeyPlayerManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

public class BasicListener implements Listener {

    private final BlockeyHockey plugin;
    private final HockeyPlayerManager hockeyPlayerManager;

    /**
     * Creates the basic listener class to listen for events.
     * @param plugin The plugin's main instance.
     */
    public BasicListener(@NotNull final BlockeyHockey plugin) {
        this.plugin = plugin;
        this.hockeyPlayerManager = plugin.hockeyPlayerManager;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent e) {
        hockeyPlayerManager.createHockeyPlayer(e.getPlayer());
    }

}
