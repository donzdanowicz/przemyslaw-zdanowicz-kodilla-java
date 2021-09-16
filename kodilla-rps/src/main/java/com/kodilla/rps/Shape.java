package com.kodilla.rps;

public interface Shape {
    String name = null;
    int key = 0;
    int computersMove = 0;
    boolean winner = true;
    String winnerIs(int computersMove);
    int getKey();
    String getName();
}
