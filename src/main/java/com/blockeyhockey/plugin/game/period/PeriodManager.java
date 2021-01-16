package com.blockeyhockey.plugin.game.period;

public class PeriodManager {

    private int period;

    /**
     * Creates a {@link PeriodManager} starting a period zero.
     */
    public PeriodManager() {
        this.period = 0;
    }

    /**
     * Creates a {@link PeriodManager} starting at a specific period.
     * @param period The period to start at.
     */
    public PeriodManager(int period) {
        this.period = period;
    }

    /**
     * Returns the current period.
     * @return the current period.
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Set the period number.
     * @param period The period to change to.
     */
    public void setPeriod(int period) {
        this.period = period;
    }

    /**
     * Increase the period by one.
     */
    public void increasePeriod() {
        increasePeriod(1);
    }

    /**
     * Increase the period by a specified increment.
     * @param increment The increment to increase the period by.
     */
    public void increasePeriod(int increment) {
        period += increment;
    }

    /**
     * Decrease the period by one.
     */
    public void decrementPeriod() {
        decrementPeriod(1);
    }

    /**
     * Decrease the period by a specified decrement.
     * @param decrement The decrement to decrease the period by.
     */
    public void decrementPeriod(int decrement) {
        period -= decrement;
    }

    /**
     * Set the period back to zero.
     */
    public void reset() {
        period = 0;
    }
}
