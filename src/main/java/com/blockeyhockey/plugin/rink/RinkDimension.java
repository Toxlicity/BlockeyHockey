package com.blockeyhockey.plugin.rink;

/**
 * The dimensions of a hockey rink.
 * @author harvanchik
 * @since 01-16-2021
 */
public class RinkDimension {

    private final double x1;
    private final double y1;
    private final double z1;
    private final double x2;
    private final double y2;
    private final double z2;

    /**
     * Create a rink dimension.
     * @param x1 The most negative X value.
     * @param y1 The most negative Y value.
     * @param z1 The most negative Z value.
     * @param x2 The most positive X value.
     * @param y2 The most positive Y value.
     * @param z2 The most positive Z value.
     */
    public RinkDimension(final double x1,
                         final double y1,
                         final double z1,
                         final double x2,
                         final double y2,
                         final double z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    /**
     * Returns the most negative X value.
     * @return the most negative X value.
     */
    public double getX1() {
        return x1;
    }

    /**
     * Returns the most negative Y value.
     * @return the most negative Y value.
     */
    public double getY1() {
        return y1;
    }

    /**
     * Returns the most negative Z value.
     * @return the most negative Z value.
     */
    public double getZ1() {
        return z1;
    }

    /**
     * Returns the most positive X value.
     * @return the most positive X value.
     */
    public double getX2() {
        return x2;
    }

    /**
     * Returns the most positive Y value.
     * @return the most positive Y value.
     */
    public double getY2() {
        return y2;
    }

    /**
     * Returns the most positive Z value.
     * @return the most positive Z value.
     */
    public double getZ2() {
        return z2;
    }
}
