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
    public GameClock(final long minutes) {
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
    public void setMilliseconds(final long milliseconds) {
        this.milliseconds = milliseconds;
    }

    /**
     * Increase milliseconds by one.
     */
    public void increaseMilliseconds() {
        increaseMilliseconds(1);
    }

    /**
     * Increment a specific amount of milliseconds to the clock.
     * @param milliseconds The amount of milliseconds to increase.
     */
    public void increaseMilliseconds(final long milliseconds) {
        this.milliseconds += milliseconds;
    }

    /**
     * Decrease milliseconds by one.
     */
    public void decreaseMilliseconds() {
        decreaseMilliseconds(1);
    }

    /**
     * Decrement a specific amount of milliseconds from the clock.
     * @param milliseconds The amount of milliseconds to decrease.
     */
    public void decreaseMilliseconds(final long milliseconds) {
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
    public void setSeconds(final long seconds) {
        this.seconds = seconds;
    }

    /**
     * Increase seconds by one.
     */
    public void increaseSeconds() {
        increaseSeconds(1);
    }

    /**
     * Increment a specific amount of seconds to the clock.
     * @param seconds The amount of seconds to increase.
     */
    public void increaseSeconds(final long seconds) {
        this.seconds += seconds;
    }

    /**
     * Decrease milliseconds by one.
     */
    public void decreaseSeconds() {
        decreaseSeconds(1);
    }

    /**
     * Decrement a specific amount of seconds from the clock.
     * @param seconds The amount of seconds to decrease.
     */
    public void decreaseSeconds(final long seconds) {
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
    public void setMinutes(final long minutes) {
        this.minutes = minutes;
    }

    /**
     * Increase minutes by one.
     */
    public void increaseMinutes() {
        increaseMinutes(1);
    }

    /**
     * Increment a specific amount of minutes to the clock.
     * @param minutes The amount of minutes to increase.
     */
    public void increaseMinutes(final long minutes) {
        this.minutes += minutes;
    }

    /**
     * Decrease minutes by one.
     */
    public void decreaseMinutes() {
        decreaseMinutes(1);
    }

    /**
     * Decrement a specific amount of minutes from the clock.
     * @param minutes The amount of minutes to decrease.
     */
    public void decreaseMinutes(final long minutes) {
        this.minutes -= minutes;
    }

    /**
     * Set minutes to zero.
     */
    public void resetMinutes() {
        this.minutes = 0;
    }
}
