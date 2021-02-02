package com.blockeyhockey.plugin.stick;

/**
 * A hockey stick.
 * @author harvanchik
 * @since 01-15-2021
 */
public abstract class HockeyStick {

    StickColor color;       // the color of the hockey stick
    int stickPower;         // the power of the stick (knockback)

    public abstract int cycleStickPower();

    public abstract void resetStickPower();
}
