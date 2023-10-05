package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for Calculator Class Activity")
public class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;

    //  The method annotated with @BeforeEach runs before each test
    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @DisplayName("Confirming the inital value is 0")
    @Test
    void testInitialValue() {
        assertEquals(0, calculator.getValue(), "Initial value should work");
    }

    @DisplayName("Confirming adding 7 to the initial value")
    @Test
    void testAdding7() {
        calculator.add(7);
        assertEquals(7, calculator.getValue(), "Adding 7 to initial value should work");
    }

    @DisplayName("Confirming subtracting 10 from initial value")
    @Test
    void testSubtracting10() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue(), "Subtracting 10 to initial value should work");
    }
}
