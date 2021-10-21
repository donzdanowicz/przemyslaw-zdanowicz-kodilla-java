package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Display {
    double val;

    public void displayValue(double val) {
        System.out.println(val);
    }
}
