package com.kodilla.exception.test;

public class ExceptionHandling{
    public String probablyIWillThrowException (double x, double y) throws Exception {
        try {
            if (x >= 2 || x < 1 || y == 1.5) {
                throw new Exception();
            }
                return "Done!";
        }   catch (Exception e) {
            System.out.println(e);
            throw new Exception();
        } finally {
        System.out.println("It works!\n");
        }
}
}
