package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Printing SimpleUser username test ok");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(6,5);

        int addResult = calculator.add(6,5);
        int subtractResult = calculator.subtract(6,5);

        if (addResult == 11) {
            System.out.println("Adding test ok");
        } else {
            System.out.println ("Error!");
        }

        if (subtractResult == 1) {
            System.out.println("Subtracting test ok");
        } else {
            System.out.println ("Error!");
        }
    }
}
