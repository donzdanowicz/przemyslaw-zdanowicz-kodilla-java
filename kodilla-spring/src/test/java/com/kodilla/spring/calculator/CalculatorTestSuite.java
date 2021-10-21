package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double addResult = calculator.add(2.0,5.0);
        double subResult = calculator.sub(8.0,6.0);
        double mulResult = calculator.mul(3.0,6.0);
        double divResult = calculator.div(9.0,2.0);

        //Then
        assertEquals(7.0, addResult);
        assertEquals(2.0, subResult);
        assertEquals(18.0, mulResult);
        assertEquals(4.5, divResult);
    }
}
