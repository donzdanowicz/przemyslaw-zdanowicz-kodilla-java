package com.kodilla.rps;

public abstract class Player {
    private String name;
    private int points = 0;

    public void addPoints() {
        points++;
    }

    public abstract int getMove();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}