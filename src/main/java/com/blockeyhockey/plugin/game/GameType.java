package com.blockeyhockey.plugin.game;

import org.jetbrains.annotations.NotNull;

/**
 * List of all of the available {@link GameType}s.
 * @author harvanchik
 * @since 02-01-2021
*/
public enum GameType {

    /**
     * One-on-one casual.
     */
    ONES("1v1", CompetitionLevel.CASUAL),

    /**
     * Two-on-two casual.
     */
    TWOS("2v2", CompetitionLevel.CASUAL),

    /**
     * Three-on-three casual.
     */
    THREES("3v3", CompetitionLevel.CASUAL),

    /**
     * Four-on-four casual.
     */
    FOURS("4v4", CompetitionLevel.CASUAL),

    /**
     * One-on-one competitive.
     */
    ONES_COMPETITIVE("1v1", CompetitionLevel.COMPETITIVE),

    /**
     * Two-on-two competitive.
     */
    TWOS_COMPETITIVE("2v2", CompetitionLevel.COMPETITIVE),

    /**
     * Three-on-three competitive.
     */
    THREES_COMPETITIVE("3v3", CompetitionLevel.COMPETITIVE);

    private final String description;           // short description of the game type
    private final CompetitionLevel level;       // the competition level of that game type

    GameType(@NotNull final String description, @NotNull final CompetitionLevel level) {
        this.description = description;
        this.level = level;
    }

    /**
     * Get the {@link GameType}'s description.
     * @return the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the {@link GameType}'s {@link CompetitionLevel}.
     * @return The competition level.
     */
    public CompetitionLevel getLevel() {
        return level;
    }
}
