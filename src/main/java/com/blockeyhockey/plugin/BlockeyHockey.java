package com.blockeyhockey.plugin;

import com.blockeyhockey.plugin.listeners.BasicListener;
import com.blockeyhockey.plugin.player.HockeyPlayerManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main instance of the plugin.
 * @author harvanchik
 * @since 01-12-2021
 */
public final class BlockeyHockey extends JavaPlugin {

    public final HockeyPlayerManager hockeyPlayerManager;

    /**
     * The constructor for the main instance.
     */
    public BlockeyHockey() {
        this.hockeyPlayerManager = new HockeyPlayerManager(this);
    }

    @Override
    public void onEnable() {
        new BasicListener(this);
    }

    @Override
    public void onDisable() {

    }
}
