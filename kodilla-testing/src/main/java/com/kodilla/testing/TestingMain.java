package com.kodilla.testing;


import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;

public class TestingMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int n = 0; n < 0; n++) {
            numbers.add(n+1);
        }

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List <Integer> evenNumbers = exterminator.exterminate(numbers);
        System.out.println(evenNumbers);

    }
}