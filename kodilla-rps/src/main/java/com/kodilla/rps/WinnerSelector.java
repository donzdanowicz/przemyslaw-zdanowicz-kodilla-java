package com.kodilla.rps;

public class WinnerSelector {
    Shape shape;
    int computersMove;

    int userCount = 0;
    int computerCount = 0;

    public void whoWins(Shape shape, int computersMove) {

        if(shape.winnerIs(computersMove).equals("win")) {
           userCount++;
        } else if(shape.winnerIs(computersMove).equals("loss")) {
            computerCount++;
        }
    }

    public int getUserCount() {
        return userCount;
    }

    public int getComputerCount() {
        return computerCount;
    }
}
