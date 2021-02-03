package com.blockeyhockey.plugin.game.clock;

import com.blockeyhockey.plugin.BlockeyHockey;
import com.blockeyhockey.utils.DurationParser;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;

/**
 * The clock for the game.
 * @author harvanchik
 * @since 01-15-2021
 */
public class GameClock {

    BlockeyHockey plugin;

    private BukkitTask gameClockTask;

    private long milliseconds;

    private boolean isRunning = false;      // controls if the clock runs or not

    /**
     * Creates the {@link GameClock} starting at 00:00.000.
     */
    public GameClock(@NotNull final BlockeyHockey plugin) {
        this.plugin = plugin;
        resetClock();
    }

    /**
     * Creates the {@link GameClock} starting at a specific time.
     * @param duration The string duration to begin at (i.e. 5m).
     */
    public GameClock(@NotNull final BlockeyHockey plugin, @NotNull final String duration) {
        milliseconds = DurationParser.parseDuration(duration);
    }

    /**
     * This method is what ticks the clock.  Every Minecraft tick, it runs.
     */
    private void tick() {
        gameClockTask = Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, () -> {
            // if time remains on the clock, continue to count down.
            if (milliseconds > 0 && isRunning) {
                milliseconds -= 50;     // subtract 50 milliseconds every tick
            } else {
                // clock reached zero
                stopClock();
            }
        }, 0L, 0L);
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
     * Set the clock's time.
     * @param duration The string duration (i.e. 5m30s).
     */
    public void setTime(String duration) {
        milliseconds = DurationParser.parseDuration(duration);
    }

    /**
     * Returns the current milliseconds on the clock.
     * @return the current milliseconds.
     */
    public long getTime() {
        return milliseconds;
    }

    /**
     * Add to the current clock's time.
     * @param duration The string duration (i.e. 25s).
     */
    public void addTime(String duration) {
        milliseconds += DurationParser.parseDuration(duration);
    }

    /**
     * Remove from the current clock's time.
     * @param duration The string duration (i.e. 1m5s).
     */
    public void removeTime(String duration) {
        milliseconds -= DurationParser.parseDuration(duration);
    }

    /**
     * Reset the clock back to 00:00.000
     */
    public void resetClock() {
        milliseconds = 0;
        stopClock();
    }

    /**
     * Returns the clock's current time in a timestamp format.
     * @return the string of the clock's time.
     */
    public String getFormattedTime() {
        long milliseconds = this.milliseconds;

        long minutes = (milliseconds / 1000) / 60;
        long seconds = (milliseconds / 1000) % 60;
        milliseconds -= ((minutes * 60 * 1000) + (seconds * 60));

        // if under 1 minute with less than 10 seconds
        if (minutes <= 0 && seconds <= 9) {
            return (minutes + ":" + seconds + "." + milliseconds);
        } else {
            return (minutes + ":" + seconds);
        }

    }

    /**
     * Returns whether the clock is running or not running.
     * @return true if running, false if not running.
     */
    public boolean isRunning() {
        return isRunning;
    }
}
