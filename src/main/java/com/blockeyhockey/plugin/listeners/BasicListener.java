package com.blockeyhockey.plugin.listeners;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.plugin.player.HockeyPlayerManager;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

/**
 * The {@link Listener} class for basic events.
 * @author harvanchik
 * @since 01-13-2021
 */
public class BasicListener implements Listener {

    private final BlockeyHockey plugin;
    private final HockeyPlayerManager hockeyPlayerManager;

    /**
     * Constructs the {@link BasicListener} to listen for events.
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

    @EventHandler
    private void onPlayerQuit(PlayerQuitEvent e) {
        hockeyPlayerManager.removeHockeyPlayer(e.getPlayer().getUniqueId());
    }

    /**
     * Event called when block fades, melts, decays, etc.
     * Stop frosted ice from melting.
     * @param e The {@link BlockFadeEvent}.
     */
    @EventHandler
    private void onBlockFade(BlockFadeEvent e) {
        Material block = e.getBlock().getType();
        if (block == Material.FROSTED_ICE) {
            e.setCancelled(true);
        }
    }

}
