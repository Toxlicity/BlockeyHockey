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
        resetMilliseconds();
        resetSeconds();
        this.minutes = minutes;
    }

    /**
     * Creates the {@link GameClock} starting at a specific amount of minutes and seconds.
     * @param seconds The amount of seconds to initialize the clock at.
     * @param minutes The amount of minutes to initialize the clock at.
     */
    public GameClock(final long seconds, final long minutes) {
        resetMilliseconds();
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
        resetMilliseconds();
        resetSeconds();
        resetMinutes();
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
     * Add milliseconds to the clock.
     * @param milliseconds The amount of milliseconds to add.
     */
    public void addMilliseconds(long milliseconds) {
        this.milliseconds += milliseconds;
    }

    /**
     * Remove milliseconds from the clock.
     * @param milliseconds The amount of milliseconds to remove.
     */
    public void removeMilliseconds(long milliseconds) {
        this.milliseconds -= milliseconds;
    }

    /**
     * Set milliseconds to zero.
     */
    public void resetMilliseconds() {
        this.milliseconds = 0;
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
     * Add seconds to the clock.
     * @param seconds The amount of seconds to add.
     */
    public void addSeconds(long seconds) {
        this.seconds += seconds;
    }

    /**
     * Remove seconds from the clock.
     * @param seconds The amount of seconds to remove.
     */
    public void removeSeconds(long seconds) {
        this.seconds -= seconds;
    }

    /**
     * Set seconds to zero.
     */
    public void resetSeconds() {
        this.seconds = 0;
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

    /**
     * Add minutes to the clock.
     * @param minutes The amount of minutes to add.
     */
    public void addMinutes(long minutes) {
        this.minutes += minutes;
    }

    /**
     * Remove minutes from the clock.
     * @param minutes The amount of minutes to remove.
     */
    public void removeMinutes(long minutes) {
        this.minutes -= minutes;
    }

    /**
     * Set minutes to zero.
     */
    public void resetMinutes() {
        this.minutes = 0;
    }
}
