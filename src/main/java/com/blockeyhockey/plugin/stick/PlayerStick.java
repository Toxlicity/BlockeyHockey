package com.blockeyhockey.plugin.stick;

/**
 * A {@link HockeyPlayer}'s hockey stick.
 * @author harvanchik
 * @since 01-15-2021
 */
public class PlayerStick extends HockeyStick {

    private StickColor color;

    public PlayerStick(StickColor color) {
        this.color = color;
    }

    @Override
    public int cycle() {
        return 0;
    }

}
