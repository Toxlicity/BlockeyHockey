package com.blockeyhockey.plugin.game;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.plugin.game.clock.GameClock;
import com.blockeyhockey.plugin.game.period.PeriodManager;
import com.blockeyhockey.plugin.rink.Rink;
import org.jetbrains.annotations.NotNull;

/**
 * This class manages a hockey game. It controls starting and ending a game among other things.
 * @author harvanchik
 * @since 01-14-2021
 */
public class HockeyGameManager {

    BlockeyHockey plugin;

    Rink rink;                          // the rink this game manager belongs to
    PeriodManager periodManager;        // this manages the period
    GameClock gameClock;                // this manages the game time
    GamePhase gamePhase;                // the phase of the game

    /**
     * Create the {@link HockeyGameManager}.
     * @param rink The rink that this {@link HockeyGameManager} belongs to.
     * @param plugin The plugin's main instance.
     */
    public HockeyGameManager(@NotNull final Rink rink, @NotNull final BlockeyHockey plugin) {
        this.plugin = plugin;
        this.periodManager = new PeriodManager();
        this.gameClock = new GameClock(plugin);
        this.gamePhase = GamePhase.PREGAME;
    }
}
