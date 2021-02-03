package com.blockeyhockey.plugin.player;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.plugin.rink.Rink;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * The object that stores all things about a {@link HockeyPlayer}.
 * @author harvanchik
 * @since 01-12-2021
 */
public class HockeyPlayer {

    private final BlockeyHockey plugin;

    /** The actual Minecraft player that is this {@link HockeyPlayer}. */
    private final Player player;

    private final PlayerGameStatistic playerGameStatistic;      // player stats for a single game

    private Rink rink;              // the rink that the player is at (null is not at a rink)
    private Position position;      // the player's hockey position (i.e. offense)
    private int stickPower;         // the player's stick power (1-3)

    /**
     * Creates a {@link HockeyPlayer}.
     * @param player The {@link Player} to create the {@link HockeyPlayer} with.
     * @param plugin The plugin's main instance.
     */
    public HockeyPlayer(@NotNull final Player player, @NotNull final BlockeyHockey plugin) {
        this.player = player;
        this.plugin = plugin;
        this.playerGameStatistic = new PlayerGameStatistic();
    }

    /**
     * Get the {@link Player} of the {@link HockeyPlayer}.
     * @return The {@link Player}.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Get the {@link Rink} that the player is currently in.
     * @return the {@link Rink} where the player is.
     */
    public Rink getRink() {
        return rink;
    }

    /**
     * Set the {@link Rink} of the player.
     * @param rink The rink to set.
     */
    public void setRink(Rink rink) {
        this.rink = rink;
    }
}
