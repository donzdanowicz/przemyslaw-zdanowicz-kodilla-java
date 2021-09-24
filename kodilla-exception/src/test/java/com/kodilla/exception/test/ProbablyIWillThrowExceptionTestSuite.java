package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbablyIWillThrowExceptionTestSuite {
    @Test
    public void testNormalConditions() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //When & Then
        assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(1.5, 3));
    }

    @Test
    public void testShouldThrowException() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //When & Then
        assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(1, 1.5));
    }

    @Test
    public void testAllAssertions() {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(1.5, 1.5)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(5, 3)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(0, 0)),
                () -> assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(1.5, 2))
        );
    }

}