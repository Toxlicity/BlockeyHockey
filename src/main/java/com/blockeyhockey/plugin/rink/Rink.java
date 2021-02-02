package com.blockeyhockey.plugin.rink;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.plugin.game.HockeyGameManager;
import com.blockeyhockey.plugin.player.HockeyPlayer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * This object holds information about a hockey rink.
 * It also holds all the information about any games being played on it.
 * @author harvanchik
 * @since 01-16-2021
 */
public class Rink {

    private final BlockeyHockey plugin;

    private final RinkDimension rinkDimension;          // the rink's dimensions

    private final HockeyGameManager gameManager;        // the rink's game manager

    private final ArrayList<HockeyPlayer> hockeyPlayers = new ArrayList<>();

    /**
     * Create a hockey rink.
     * @param plugin The plugin's main instance.
     * @param rinkDimension The dimensions for the rink.
     */
    public Rink(@NotNull final BlockeyHockey plugin, @NotNull final RinkDimension rinkDimension) {
        this.plugin = plugin;
        this.rinkDimension = rinkDimension;
        this.gameManager = new HockeyGameManager(this, plugin);
    }
}
