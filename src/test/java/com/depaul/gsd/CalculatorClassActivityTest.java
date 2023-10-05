package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @Test
    void checkValue(){
        assertEquals(0, calculator.getValue());
    }

    @Test
    void add() {
        calculator.add(7);
        assertEquals(7, calculator.getValue());
    }

    @Test
    void subtract() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue());
    }

}