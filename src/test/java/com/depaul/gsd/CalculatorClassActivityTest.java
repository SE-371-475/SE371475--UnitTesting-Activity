package com.depaul.gsd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    CalculatorClassActivity calculator;
    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm adding 7 to initial value")
    void add() {
        calculator.add(7);
        assertEquals(calculator.getValue(), 7);
    }

    @Test
    @DisplayName("Confirm subtracting 10 from the initial value")
    void subtract() {
        calculator.subtract(10);
        assertEquals(calculator.getValue(), -10);
    }

    @Test
    @DisplayName("Confirm the initial value is 0")
    void getValue() {
        assertEquals(calculator.getValue(), 0);
    }
}