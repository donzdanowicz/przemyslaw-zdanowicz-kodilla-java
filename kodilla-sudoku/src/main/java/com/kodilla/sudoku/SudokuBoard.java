package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final SudokuRow row;
    private final List<SudokuRow> rows = new ArrayList<>();
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 8;

    public SudokuBoard(SudokuRow row) {
        this.row = row;
    }

    public void addBoardElements() {
        for(int i = 0; i < 9; i++) {
            rows.add(new SudokuRow(new SudokuElement()));
            rows.get(i).addElements();

        }
    }

    public List<SudokuRow> getRows() {
        return rows;
    }

    public String toString() {
        String result = "";
        for (int y = MIN_INDEX; y <= MAX_INDEX; y++) {
            result += "|";
            for (int x = MIN_INDEX; x <= MAX_INDEX; x++) {
                if (getRows().get(y).getElements().get(x).getValue() == -1) {
                    result += "   ";
                } else {
                    result += " " + getRows().get(y).getElements().get(x).getValue() + " ";
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }

}
