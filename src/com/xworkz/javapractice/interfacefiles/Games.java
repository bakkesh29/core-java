package com.xworkz.javapractice.interfacefiles;

public interface Games {

    int getPlayerCount();
    double getPrizeMoney();
    boolean isLive();
    long getViewers();
    char getLevel();

    Player getPlayer();
    Tournament getTournament();
    GameStatus getStatus();
    Sports getSports();

    int[] getScores();
    double[] getRatings();

    Player[] getPlayers();
    Tournament[] getTournaments();

    void startGame();
    void endGame();
}