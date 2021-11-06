package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player{
    private static final Random shapeSelector = new Random();

    @Override
    public int getMove() {
        return shapeSelector.nextInt(3) + 1;
    }
}