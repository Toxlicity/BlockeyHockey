package com.blockeyhockey.plugin.player;

/**
 * This class holds all of the player's statistics for a single game.
 * @author harvanchik
 * @since 02-02-2021
*/
public class PlayerGameStatistic {

    // primary statistics
    private int goals;                  // number of goals scored
    private int primaryAssists;         // number of primary assists
    private int secondaryAssists;       // number of secondary assists
    private int shots;                  // number of shots (different from puck hits)

    // extra statistics
    private int goalsFor;               // number of goals scored by the player's own team
    private int goalsAgainst;           // number of goals scored by the opponent team
    private int plusMinus;              // goal differential
    private int hatTricks;              // number of hat tricks (3 goals scored)
    private double iceTime;             // minutes spent on the ice
    private int gameWinningGoals;       // number of goals to win the game (not necessarily overtime goals)
    private int overtimeGoals;          // number of goals scored in overtime

    /**
     * Get total number of goals scored.
     * @return number of goals scored.
     */
    public int getGoals() {
        return goals;
    }

    /**
     * Add a goal to player's total goals scored.
     */
    public void addGoal() {
        goals++;
        if (goals % 3 == 0) {
            addHatTrick();
        }
    }

    /**
     * Get total number of goals assisted.
     * @return number of goals assisted.
     */
    public int getAssists() {
        return (primaryAssists + secondaryAssists);
    }

    /**
     * Add a secondary assist to player's total secondary goals assisted.
     * @return number of primary assists.
     */
    public void addPrimaryAssist() {
        primaryAssists++;
    }

    /**
     * Add a secondary assist to player's total secondary goals assisted.
     * @return number of secondary assists.
     */
    public void addSecondaryAssist() {
        secondaryAssists++;
    }

    /**
     * Get total number of shots player has taken.
     * @return number of shots taken.
     */
    public int getShots() {
        return shots;
    }

    /**
     * Add a shot to player's total number of shots taken.
     */
    public void addShot() {
        shots++;
    }

    /**
     * Get goals scored by player's own team.
     * @return goals score by player's own team.
     */
    public int getGoalsFor() {
        return goalsFor;
    }

    /**
     * Add a goal to goals for when player's own team scores.
     */
    public void addGoalsFor() {
        goalsFor++;
        increasePlusMinus();
    }

    /**
     * Get goals scored by the opponent team.
     * @return goals score by the opponent team.
     */
    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    /**
     * Add a goal to goals against when the opponent team scores.
     */
    public void addGoalsAgainst() {
        goalsAgainst++;
        decreasePlusMinus();
    }

    /**
     * Increase the player's plus/minus by one.
     */
    public void increasePlusMinus() {
        plusMinus++;
    }

    /**
     * Decrease the player's plus/minus by one.
     */
    public void decreasePlusMinus() {
        plusMinus--;
    }

    /**
     * Get the plus/minus of the player.
     * @return the plus/minus.
     */
    public int getPlusMinus() {
        return plusMinus;
    }

    /**
     * Get number of hat tricks scored by the player.
     * @return
     */
    public int getHatTricks() {
        return hatTricks;
    }

    /**
     * Add a hat trick to player's total hat tricks.
     */
    public void addHatTrick() {
        this.hatTricks++;
    }

    /**
     * Get the player's total ice time.
     * @return ice time.
     */
    public double getIceTime() {
        return iceTime;
    }

    /**
     * Increase player's total ice time by a number of seconds.
     * @param seconds Seconds to increase ice time by.
     */
    public void increaseIceTime(double seconds) {
        this.iceTime += seconds;
    }

    /**
     * Get number of game winning goals scored by player.
     * @return number of game winning goals.
     */
    public int getGameWinningGoals() {
        return gameWinningGoals;
    }

    /**
     * Add a game winning goals to player's total number of game winning goals.
     */
    public void addGameWinningGoal() {
        this.gameWinningGoals++;
    }

    /**
     * Get total number of overtime goals scored by player.
     * @return overtime goals.
     */
    public int getOvertimeGoals() {
        return overtimeGoals;
    }

    /**
     * Add an overtime goal to player's total number of overtime goals.
     */
    public void addOvertimeGoal() {
        this.overtimeGoals++;
    }

    /**
     * Reset all statistics back to zeros.
     */
    public void resetStats() {
        goals = 0;
        primaryAssists = 0;
        secondaryAssists = 0;
        shots = 0;
        goalsFor = 0;
        goalsAgainst = 0;
        plusMinus = 0;
        hatTricks = 0;
        iceTime = 0.0;
        gameWinningGoals = 0;
        overtimeGoals = 0;
    }
}
