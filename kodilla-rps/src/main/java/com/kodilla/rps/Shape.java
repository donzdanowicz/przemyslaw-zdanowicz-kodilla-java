package com.kodilla.rps;

public class Shape {

    public static String shape(int move) {
        switch(move) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return null;
        }
    }
}
