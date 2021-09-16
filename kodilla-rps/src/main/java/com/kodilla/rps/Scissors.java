package com.kodilla.rps;

public class Scissors implements Shape {
    String name = "Scissors";
    int key = 3;

    public String getName() {
        return name;
    }

    public int getKey() {
        return key;
    }

    public String winnerIs(int computersMove) {
        if (computersMove == 2) {
            return "win";
        } else if (computersMove == 3){
            return "draw";
        } else {
            return "loss";
        }

    }
}
