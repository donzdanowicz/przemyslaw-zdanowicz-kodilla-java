package com.kodilla.rps;

import java.util.Random;

public class Computer {
    Random shapeSelector = new Random();
    int computersMove = shapeSelector.nextInt(3) + 1;
    String name = "";

    public int getComputersMove() {
        return computersMove;
    }

    public String shape() {
        if (computersMove == 1) {
            name = "Rock";
        } else if (computersMove == 2) {
            name = "Paper";
        } else if (computersMove == 3) {
            name = "Scissors";
        }
        return name;
    }
}
