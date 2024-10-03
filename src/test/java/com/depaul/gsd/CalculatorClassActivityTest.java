package com.depaul.gsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Robinkumar TestClass")
public class CalculatorClassActivityTest {

     private CalculatorClassActivity calculator;

    @BeforeEach
    public void setUp() {
        // Initialize a new CalculatorClassActivity before each test
        calculator = new CalculatorClassActivity();
    }
    @Test
    @DisplayName("Testing Add()")
    void testAdd() {
        calculator.add(10);
        assertEquals(10, calculator.getValue(), "After adding 10, value should be 10");

        calculator.add(5);
        assertEquals(15, calculator.getValue(), "After adding 5 more, value should be 15");
    }
    

    @Test
    @DisplayName("Testing getValue()")
    void testGetValue() {
        assertEquals(0, calculator.getValue(), "Initial value should be 0");
    }

    @Test
    @DisplayName("Testing subtract()")
    void testSubtract() {
        calculator.subtract(5);
        assertEquals(-5, calculator.getValue(), "After subtracting 5, value should be -5");

        calculator.subtract(10);
        assertEquals(-15, calculator.getValue(), "After subtracting 10 more, value should be -15");

    }
}
