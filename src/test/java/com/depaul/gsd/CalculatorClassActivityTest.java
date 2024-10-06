package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Garner: CalculatorClassActivityTest")
class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
      calculator = new CalculatorClassActivity();
    }
    @Test
    @DisplayName("Initial value should be 0")
    void isInitialValueZero() {
        int expected = 0;
        int actual = calculator.getValue();
        assertEquals(expected,actual,"initial value should be 0");


    }

    @Test
    void add() {
        
        calculator.add(7);
        int actual = calculator.getValue();
        assertEquals(7,actual, "result should be 7");
    }

    @Test
    void subtract() {
        int expected = -10;
        calculator.subtract(10);
        assertEquals(expected, calculator.getValue(), "Should be -10");
    }

    @Test
    void getValue() {
    }
}



