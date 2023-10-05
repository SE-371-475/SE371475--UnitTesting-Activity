package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    CalculatorClassActivity calculatorCa;

    // The method annotated with @BeforeEach runs before each test
    @BeforeEach
    void setUp() {
        this.calculatorCa = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Initial value is zero")
    void initialValueIsZero() {
        assertEquals(0, this.calculatorCa.value, "Initial value should be zero");
    }

    @Test
    @DisplayName("Seven adds to initial")
    void sevenAddsToBAse() {
        this.calculatorCa.add(7);

        assertEquals(7, this.calculatorCa.value, "Adding seven to the initial value should give seven.");
    }

    @Test
    @DisplayName("Subtract 10 from initial")
    void subtractTen() {
        this.calculatorCa.subtract(10);

        assertEquals(-10, this.calculatorCa.value, "Subtracting 10 from initial value should give -10.");
    }
}