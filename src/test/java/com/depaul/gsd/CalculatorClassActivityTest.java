package com.depaul.gsd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Burdick: Checking initial value, add, subtract, and getValue")
class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;
    @BeforeEach
    void setUp() {
        calculator=new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Ensure initial value of calculator should be zero")
    void initialValue() {
        int expected=0;
        int actual=calculator.getValue();
        assertEquals(expected, actual, "Initial value for calculator should be zero");
    }

    @Test
    @DisplayName("Ensure addition works")
    void add() {
        int expected=7;
        calculator.add(7);
        int actual=calculator.getValue();
        assertEquals(expected, actual, "Calculator should have value of 7 after adding 7");
    }

    @Test
    @DisplayName("Ensure subtraction works")
    void subtract() {
        int expected=-10;
        calculator.subtract(10);
        int actual=calculator.getValue();
        assertEquals(expected, actual, "Calculator should have value of 10 after subtracting 10");
    }

    @Test
    void getValue() {
        
    }

}