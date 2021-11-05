package com.kodilla.rps;

import java.util.Random;

public class Computer {
    Random shapeSelector = new Random();
    private int computersMove;
    private int computerCount;
    private int computerRoundResult = 0;

    public int computersMove() {
        computersMove = shapeSelector.nextInt(3) + 1;
        return computersMove;
    }

    public int getComputerCount() {
        return computerCount;
    }

    public int getComputerRoundResult() {
        return computerRoundResult;
    }

    public void setComputerCount(int computerCount) {
        this.computerCount = computerCount;
    }

    public void setComputerRoundResult(int computerRoundResult) {
        this.computerRoundResult = computerRoundResult;
    }
}
