package com.kodilla.rps;

public class Game {
    private int rounds;
    private int userRoundResult = 0;
    private int computerRoundResult = 0;

    public int getRounds() {
        return rounds;
    }

    public int getUserRoundResult() {
        return userRoundResult;
    }

    public int getComputerRoundResult() {
        return computerRoundResult;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setUserRoundResult(int userRoundResult) {
        this.userRoundResult = userRoundResult;
    }

    public void setComputerRoundResult(int computerRoundResult) {
        this.computerRoundResult = computerRoundResult;
    }
}