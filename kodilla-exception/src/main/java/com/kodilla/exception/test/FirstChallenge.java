package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        try {
            if (b == 0) {
            throw new ArithmeticException();
        }
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong. Error: " + e);
        } finally {
            System.out.println("Never divide by zero!");
        }
        return 0;
    }
}


