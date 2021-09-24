package com.kodilla.testing.collection;

import java.util.*;
import java.io.*;
import java.lang.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> even = new ArrayList<>();
        for (Integer value : numbers) {
            if (value % 2 == 0) {
                even.add(value);
            }
        }
        return even;
    }
}