package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    private CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Adding 7 to the initial value")
    void add() {
        calculator.add(7);
        assertEquals(7, calculator.getValue(), "Adding 7 should return 7.");
    }

    @Test
    @DisplayName("Subtracting 10 from the initial value")
    void subtract() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue(), "Subtracting 10 should return -10.");
    }

    @Test
    @DisplayName("Confirm initial value is 0")
    void getValue() {
        assertEquals(0, calculator.getValue(), "Initial value should be 0.");

    }
}