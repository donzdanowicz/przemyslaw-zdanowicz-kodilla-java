package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuGame {
    public SudokuBoard board = new SudokuBoard(new SudokuRow(new SudokuElement()));
    private static final int MIN_INDEX = 0;
    private static final int MAX_INDEX = 8;
    private String usersNumbers;
    private String digits;
    private boolean areDigits = false;
    private boolean notZero = false;

    public boolean isSudoku() {
        return "SUDOKU".equalsIgnoreCase(usersNumbers);
    }

    public boolean usersKeysAreCorrect() {
        if (isSudoku()) {
            return true;
        } else if (usersNumbers.length() == 5) {
            digits = usersNumbers.substring(0, 1) + usersNumbers.substring(2, 3) + usersNumbers.substring(4, 5);
            areDigits = digits.chars().allMatch(Character::isDigit);
            notZero = Integer.parseInt(usersNumbers.substring(0, 1)) > 0
                    && Integer.parseInt(usersNumbers.substring(2, 3)) > 0
                    && Integer.parseInt(usersNumbers.substring(4, 5)) > 0;
            if (areDigits && notZero && ",".equals(usersNumbers.substring(1, 2))
                    && ",".equals(usersNumbers.substring(3, 4))) {
                return true;
            }
        }
        return false;
    }

    public void solveSudoku() {
        for (int y = MIN_INDEX; y <= MAX_INDEX; y++) {
            for (int x = MIN_INDEX; x <= MAX_INDEX; x++) {
                SudokuElement element = board.getRows().get(x).getElements().get(y);
                if (element.getValue() == -1) {
                    if (element.getPossibleValues().size() == 1) {
                        element.setValue(element.getPossibleValues().stream().findFirst().orElse(-1));
                        //System.out.println(element.getPossibleValues().stream().findFirst().orElse(-1));
                        System.out.println("size = 1?");
                    } else {
                        System.out.println("Too many possibilities.");
                    }
                } else {
                    removePossibleValue(x, y, element.getValue());

                }
                //
            }
            //
        }
    }

    public void checkPossibleValues() {
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("i: " + (i+1) + " j: " + (j+1) + "   " + getBoard().getRows().get(i).getElements().get(j).getPossibleValues());
            }
        }
    }

    public boolean isThereOnlyOnePossibleValue(int row, int column, int value) {
        for( int x = MIN_INDEX; x <= MAX_INDEX; x++) {
            if(board.getRows().get(row).getElements().get(x).getPossibleValues().size() == 1
               && board.getRows().get(row).getElements().get(x).getPossibleValues().contains(value)
               && board.getRows().get(row).getElements().get(column).getPossibleValues().size() == 0){
                System.out.println("Using this value would cause a paradox");
                return true;
            }
        }

        for( int x = MIN_INDEX; x <= MAX_INDEX; x++) {
            if(board.getRows().get(x).getElements().get(column).getPossibleValues().size() == 1
               && board.getRows().get(x).getElements().get(column).getPossibleValues().contains(value)
               && board.getRows().get(row).getElements().get(column).getPossibleValues().size() == 0) {
               //&& !board.getRows().get(row).getElements().get(column).getPossibleValues().contains(value)) {
                System.out.println("Using this value would cause a paradox");
                return true;
            }
        }
        
        return false;
    }
    
    public void removePossibleValue(int row, int column, int value) {
        for( int x = MIN_INDEX; x <= MAX_INDEX; x++) {
            board.getRows().get(row).getElements().get(x).removePossibleValue(value);
        }
        for( int x = MIN_INDEX; x <= MAX_INDEX; x++) {
            board.getRows().get(x).getElements().get(column).removePossibleValue(value);
        }
        //toDo add block
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public String getUsersNumbers() {
        return usersNumbers;
    }

    public void setUsersNumbers(String usersNumbers) {
        this.usersNumbers = usersNumbers;
    }

    public int getUsersX() {
        return Integer.parseInt(usersNumbers.substring(0, 1)) - 1;
    }

    public int getUsersY() {
        return Integer.parseInt(usersNumbers.substring(2, 3)) - 1;
    }

    public int getUsersValue() {
        return Integer.parseInt(usersNumbers.substring(4, 5));
    }

    public boolean resolveSudoku() {
        return true;
    }
}
