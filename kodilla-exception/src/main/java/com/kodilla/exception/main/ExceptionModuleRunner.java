package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.FirstChallenge;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {
    public static void main (String[] args) throws Exception{
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        String result = exceptionHandling.probablyIWillThrowException(1, 1);
        System.out.println(result);



        /*     FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
*/
        /* FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        fileReader.readFile();
*/

     /*   /**
         * This main can throw an ArithmeticException!!!
         * @param args
         */
/*
            FirstChallenge firstChallenge = new FirstChallenge();
            double result = firstChallenge.divide(3, 0);

            System.out.println(result);
*/
/*
        FileReader fileReader = new FileReader();
        fileReader.readFile();
*/
    }
}
