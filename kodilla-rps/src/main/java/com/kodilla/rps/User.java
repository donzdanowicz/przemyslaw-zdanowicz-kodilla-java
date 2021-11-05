package com.kodilla.rps;

public class User {
    private String userName;
    private int rounds;
    private int usersMove;
    private int userCount;
    private int userRoundResult = 0;

    public String getUserName() {
        return userName;
    }

    public int getRounds() {
        return rounds;
    }

    public int getUserCount() {
        return userCount;
    }

    public int getUserRoundResult() {
        return userRoundResult;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setUsersMove(int usersMove) {
        this.usersMove = usersMove;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public void setUserRoundResult(int userRoundResult) {
        this.userRoundResult = userRoundResult;
    }
}

