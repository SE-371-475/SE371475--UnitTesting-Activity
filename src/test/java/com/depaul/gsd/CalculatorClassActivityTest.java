package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Aiden: testing calculator")
class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() { // Auto create a new calculator instance before each test case.
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Test calculator addition")
    void add() {
        int expected = 7;
        calculator.add(expected);
        int actual = calculator.getValue();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test calculator subtraction")
    void subtract() {
        int expected = 10;
        calculator.subtract(expected);
        int actual = calculator.getValue();
        assertEquals(-expected, actual);
    }

    @Test
    @DisplayName("Test initial value is zero")
    void getValue() {
        int actual = calculator.getValue();
        assertEquals(0, actual, "The initial calculator value was not 0.");
    }
}