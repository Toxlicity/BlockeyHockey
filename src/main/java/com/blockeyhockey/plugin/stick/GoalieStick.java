package com.blockeyhockey.plugin.stick;

/**
 * A goalie stick.
 * @author harvanchik
 * @since 01-15-2021
 */
public class GoalieStick extends HockeyStick {

    private StickColor color;       // the color of the hockey stick
    private int stickPower;         // the power of the stick (knockback)
    // TODO: Change stick power to goalie mode


    @Override
    public int cycle() {
        if (stickPower < 2) {
            stickPower++;
        } else {
            stickPower = 1;
        }
        return stickPower;
    }
}
