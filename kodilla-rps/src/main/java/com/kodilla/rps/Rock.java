package com.kodilla.rps;

public class Rock implements Shape{
    String name = "Rock";
    int key = 1;
    int computersMove = 0;

    public String getName() {
        return name;
    }

    public int getKey() {

        return key;
    }

    public String winnerIs(int computersMove) {
        if (computersMove == 3) {
            return "win";
        } else if (computersMove == 1){
            return "draw";
        } else {
            return "loss";
        }

    }
}
