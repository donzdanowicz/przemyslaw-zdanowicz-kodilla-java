package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            theGame.getBoard().addBoardElements();

         /*   System.out.println("Remember to put x and y from 0!");
            theGame.serveNewEntry(0,0,7);
            theGame.serveNewEntry(0,1,8);
            theGame.serveNewEntry(0,2,2);
            theGame.serveNewEntry(0,3,6);
            theGame.serveNewEntry(0,4,1);
            theGame.serveNewEntry(0,6,9);
            theGame.serveNewEntry(0,8,5);
            theGame.serveNewEntry(1,0,5);
            theGame.serveNewEntry(1,1,6);
            theGame.serveNewEntry(1,3,9);
            theGame.serveNewEntry(1,4,4);
            theGame.serveNewEntry(1,5,2);
            theGame.serveNewEntry(1,6,8);
            theGame.serveNewEntry(1,8,3);
            theGame.serveNewEntry(2,5,7);
            theGame.serveNewEntry(2,6,2);
            theGame.serveNewEntry(2,8,1);
            theGame.serveNewEntry(3,1,7);
            theGame.serveNewEntry(3,2,6);
            theGame.serveNewEntry(3,3,4);
            theGame.serveNewEntry(3,5,5);
            theGame.serveNewEntry(4,0,3);
            theGame.serveNewEntry(4,7,2);
            theGame.serveNewEntry(5,3,3);
            theGame.serveNewEntry(5,4,6);
            theGame.serveNewEntry(5,6,5);
            theGame.serveNewEntry(6,0,6);
            theGame.serveNewEntry(6,1,1);
            theGame.serveNewEntry(6,6,7);
            theGame.serveNewEntry(6,7,9);
            theGame.serveNewEntry(7,1,2);
            theGame.serveNewEntry(7,2,3);
            theGame.serveNewEntry(7,4,9);
            theGame.serveNewEntry(7,7,5);
            theGame.serveNewEntry(8,5,4);
            theGame.serveNewEntry(8,6,6);

            theGame.bestElementsToChoose();*/

            theGame.serveNewEntry(0,6,4);
            theGame.serveNewEntry(0,7,5);
            theGame.serveNewEntry(0,8,2);
            theGame.serveNewEntry(1,0,8);
            theGame.serveNewEntry(1,1,9);
            theGame.serveNewEntry(1,6,3);
            theGame.serveNewEntry(2,0,1);
            theGame.serveNewEntry(2,6,8);
            theGame.serveNewEntry(3,2,8);
            theGame.serveNewEntry(3,3,5);
            theGame.serveNewEntry(3,5,4);
            theGame.serveNewEntry(4,1,5);
            theGame.serveNewEntry(5,1,4);
            theGame.serveNewEntry(5,5,2);
            theGame.serveNewEntry(5,8,3);
            theGame.serveNewEntry(6,4,3);
            theGame.serveNewEntry(6,7,2);
            theGame.serveNewEntry(7,3,8);
            theGame.serveNewEntry(7,8,6);
            theGame.serveNewEntry(8,0,7);
            theGame.serveNewEntry(8,2,6);
            theGame.serveNewEntry(8,4,9);

            theGame.bestElementsToChoose();

            theGame.gameCore();
            gameFinished = theGame.resolveSudoku();

        }
    }
}
