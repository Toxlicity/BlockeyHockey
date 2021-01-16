package com.blockeyhockey.plugin.game;

public enum GamePhase {

    /**
     * The phase before a game has started.
     * Usually consists of teams practicing by taking shots on their own goalie.
     */
    PREGAME,

    /**
     * The phase in-between PREGAME and RUNNING.
     * Teams are lining up to take the faceoff.
     */
    STARTING,

    /**
     * The phase the game is in during live play.
     * Teams are actively trying to score a goal on their opponent.
     */
    RUNNING,

    /**
     * A phase during a game in which play is stopped or paused.
     * Usually occurs if the puck is out of play, the goalie makes a save, the play is offside,
     * a player commits a penalty, a timeout is called, etc.
     */
    IDLE,

    /**
     * The phase of a game that occurs between two periods.
     * This phase only occurs after period one.
     */
    INTERMISSION,

    /**
     * The phase of the game after a team wins.
     * Usually occurs after regulation, but can occur after a team scores a sudden death game-winning goal.
     */
    FINISHED;
}
