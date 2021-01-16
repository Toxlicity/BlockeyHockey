package com.blockeyhockey.plugin.game.clock;

/**
 * The clock for the game.
 * @author harvanchik
 * @since 01-15-2021
 */
public class GameClock {

    private long milliseconds;
    private long seconds;
    private long minutes;

    private boolean isRunning = false;      // controls if the clock runs or not

    /**
     * Creates the {@link GameClock} starting at 00:00.000.
     */
    public GameClock() {
        resetClock();
    }

    /**
     * Creates the {@link GameClock} starting at a specific amount of minutes.
     * @param minutes The amount of minutes to initialize the clock at.
     */
    public GameClock(long minutes) {
        this.milliseconds = 0;
        this.seconds = 0;
        this.minutes = minutes;
    }

    /**
     * Creates the {@link GameClock} starting at a specific amount of minutes and seconds.
     * @param seconds The amount of seconds to initialize the clock at.
     * @param minutes The amount of minutes to initialize the clock at.
     */
    public GameClock(long seconds, long minutes) {
        this.milliseconds = 0;
        this.seconds = seconds;
        this.minutes = minutes;
    }

    /**
     * Start running the clock.
     */
    public void startClock() {
        isRunning = false;
    }

    /**
     * Stop running the clock.
     */
    public void stopClock() {
        isRunning = true;
    }

    /**
     * Reset the clock back to 00:00.000
     */
    public void resetClock() {
        this.milliseconds = 0;
        this.seconds = 0;
        this.minutes = 0;
        stopClock();
    }

    /**
     * Returns whether the clock is running or not running.
     * @return true if running, false if not running.
     */
    public boolean isRunning() {
        return isRunning;
    }

    /**
     * Returns the current milliseconds on the clock.
     * @return the current milliseconds.
     */
    public long getMilliseconds() {
        return milliseconds;
    }

    /**
     * Set the clock's milliseconds.
     * @param milliseconds The value to set milliseconds to.
     */
    public void setMilliseconds(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    /**
     * Returns the current seconds on the clock.
     * @return the current seconds.
     */
    public long getSeconds() {
        return seconds;
    }

    /**
     * Set the clock's seconds.
     * @param seconds The value to set seconds to.
     */
    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }

    /**
     * Returns the current minutes on the clock.
     * @return the current minutes.
     */
    public long getMinutes() {
        return minutes;
    }

    /**
     * Set the clock's minutes.
     * @param minutes The value to set minutes to.
     */
    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }
}
