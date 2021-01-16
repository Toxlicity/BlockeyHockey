package com.blockeyhockey.plugin.stick;

/**
 * A player hockey stick.
 * @author harvanchik
 * @since 01-15-2021
 */
public class PlayerStick extends HockeyStick {

    private StickColor color;       // the color of the hockey stick
    private int stickPower;         // the power of the stick (knockback)

    /**
     * Creates a black {@link PlayerStick}.
     */
    public PlayerStick() {
        this.color = StickColor.BLACK;
        this.stickPower = 1;
    }

    /**
     * Creates a {@link PlayerStick} with a specific color.
     * @param color The color of the stick.
     */
    public PlayerStick(StickColor color) {
        this.color = color;
        this.stickPower = 1;
    }

    /**
     * Cycle the stick power.
     * @return the power after cycling.
     */
    @Override
    public int cycle() {
       if (stickPower < 3) {
           stickPower++;
       } else {
           stickPower = 1;
       }
       return stickPower;
    }
}
