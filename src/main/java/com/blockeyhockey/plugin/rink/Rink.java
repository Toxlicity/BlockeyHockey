package com.blockeyhockey.plugin.rink;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.plugin.game.HockeyGameManager;
import org.jetbrains.annotations.NotNull;

/**
 * This object holds information about a hockey rink.
 * It also holds all the information about any games being played on it.
 * @author harvanchik
 * @since 01-16-2021
 */
public class Rink {

    private final BlockeyHockey plugin;

    private final RinkDimension rinkDimension;

    private final HockeyGameManager gameManager;

    public Rink(@NotNull final BlockeyHockey plugin, @NotNull final RinkDimension rinkDimension) {
        this.plugin = plugin;
        this.rinkDimension = rinkDimension;
        this.gameManager = new HockeyGameManager(this, plugin);
    }


}
