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
                () -> assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(0.99999999, 2.0)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(2.00000001, 3.0)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(2.0, 0.0)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.probablyIWillThrowException(1.5, 1.5)),
                () -> assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(1.99999999, 2.0)),
                () -> assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(1.00000001, 1.0)),
                () -> assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(1.5, 1.50000001)),
                () -> assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(1.5, 1.49999999)),
                () -> assertDoesNotThrow(() -> exceptionHandling.probablyIWillThrowException(1.5, 1.0))
        );
    }

}