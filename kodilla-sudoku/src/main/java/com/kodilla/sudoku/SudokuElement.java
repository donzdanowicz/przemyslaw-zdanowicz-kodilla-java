package com.kodilla.sudoku;

import java.util.*;

public class SudokuElement {
    public static int EMPTY = -1;
    private int value = EMPTY;
    private Set<Integer> possibleValues = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

    public void removePossibleValue(Integer value) {
        possibleValues.remove(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Set<Integer> getPossibleValues() {
        return possibleValues;
    }
}
