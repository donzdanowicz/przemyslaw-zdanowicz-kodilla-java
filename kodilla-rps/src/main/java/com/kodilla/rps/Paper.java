package com.kodilla.rps;

public class Paper implements Shape {
    String name = "Paper";
    int key = 2;


    public String getName() {
        return name;
    }

    public int getKey() {
        return key;
    }

    public String winnerIs(int computersMove) {
        if (computersMove == 1) {
            return "win";
        } else if (computersMove == 2){
            return "draw";
        } else {
            return "loss";
        }

    }
}

