package com.blockeyhockey.plugin.game;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.plugin.game.clock.GameClock;
import com.blockeyhockey.plugin.game.period.PeriodManager;

/**
 * This class manages a hockey game. It controls starting and ending a game among other things.
 * @author harvanchik
 * @since 01-14-2021
 */
public class HockeyGameManager {

    BlockeyHockey plugin;

    PeriodManager periodManager;        // this manages the game's period
    GameClock gameClock;                // this manages the game time
    GamePhase gamePhase;                // the phase of the game


    public HockeyGameManager(BlockeyHockey plugin) {
        this.plugin = plugin;
        this.periodManager = new PeriodManager();
        this.gameClock = new GameClock();
        this.gamePhase = GamePhase.PREGAME;
    }


}
