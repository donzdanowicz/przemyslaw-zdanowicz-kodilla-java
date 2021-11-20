package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) {
        boolean gameFinished = false;
        Scanner scan = new Scanner(System.in);


        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();

            SudokuBoard board = theGame.getBoard();
            board.addBoardElements();

            System.out.println("First two numbers are x (row) and y (column) - board coordinates. " +
                    "Third number is a value.");
            System.out.println("Type in 3 numbers (from 1 to 9) separated by comma (without space) e.g. 3,5,5");

            //System.out.println(board);
            //theGame.getBoard().getRows().get(0).getElements().get(0).setValue(1);
            //theGame.getBoard().getRows().get(1).getElements().get(0).setValue(2);
            //theGame.getBoard().getRows().get(2).getElements().get(0).setValue(3);
            //theGame.getBoard().getRows().get(3).getElements().get(0).setValue(4);
            //theGame.getBoard().getRows().get(4).getElements().get(0).setValue(5);
            //theGame.getBoard().getRows().get(5).getElements().get(0).setValue(6);
            //theGame.getBoard().getRows().get(6).getElements().get(0).setValue(7);
            //theGame.getBoard().getRows().get(8).getElements().get(0).setValue(9);

            System.out.println(board);

            //theGame.removePossibleValue(7, 0, 8);
            /*
            System.out.println(theGame.getBoard().getRows().get(0).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(1).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(2).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(3).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(4).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(5).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(6).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(8).getElements().get(0).getPossibleValues());

            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(0).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(1).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(2).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(3).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(4).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(5).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(6).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(7).getPossibleValues());
            System.out.println(theGame.getBoard().getRows().get(7).getElements().get(8).getPossibleValues());

             */


            while(!theGame.isSudoku()) {

                theGame.setUsersNumbers(scan.nextLine());

                if (theGame.usersKeysAreCorrect() && !theGame.isSudoku()) {
                    if(board.getRows().get(theGame.getUsersX()).getElements()
                       .get(theGame.getUsersY()).getPossibleValues().contains(theGame.getUsersValue())
                       && !theGame.isThereOnlyOnePossibleValue(theGame.getUsersX(),
                       theGame.getUsersY(), theGame.getUsersValue())) {
                        board.getRows().get(theGame.getUsersX()).getElements().get(theGame.getUsersY())
                                .setValue(theGame.getUsersValue());
                        System.out.println(board);
                        theGame.removePossibleValue(theGame.getUsersX(), theGame.getUsersY(), theGame.getUsersValue());
                        theGame.getBoard().getRows().get(theGame.getUsersX()).getElements().get(theGame.getUsersY())
                                .getPossibleValues()
                                .removeAll(theGame.getBoard().getRows().get(theGame.getUsersX())
                                        .getElements().get(theGame.getUsersY()).getPossibleValues());
                    } else {
                        System.out.println("This value already exists in a row, column or block it can't be chosen " +
                                "because it would cause a paradox.");
                    }

                } else if (theGame.isSudoku()) {
                    //theGame.getBoard().getRows().get(2).getElements().get(2).getPossibleValues()
                    //        .removeAll(theGame.getBoard().getRows().get(2).getElements().get(2).getPossibleValues());
                    //theGame.getBoard().getRows().get(2).getElements().get(2).getPossibleValues().add(5);
                    theGame.checkPossibleValues();
                    theGame.solveSudoku();
                    System.out.println("SUDOKU solved");
                    System.out.println(theGame.getBoard().getRows().get(0).getElements().get(7).getValue());
                    System.out.println(theGame.getBoard().getRows().get(0).getElements().get(7).getPossibleValues());
                    System.out.println(board);
                } else {
                    System.out.println("Wrong keys. Type in SUDOKU to solve sudoku \n" +
                            "or 3 numbers (from 1 to 9) separated by comma e.g. 3,5,5");
                }
            }



        }
    }
}
