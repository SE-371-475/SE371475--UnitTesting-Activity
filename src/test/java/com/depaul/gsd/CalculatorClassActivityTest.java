package com.depaul.gsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorClassActivityTest {


    @Test
    @DisplayName("Test Get Value")
    void testGetValue() {
        CalculatorClassActivity calculatorClassActivity = new CalculatorClassActivity();
        int expectedValue = 0;
        assertEquals(expectedValue, calculatorClassActivity.getValue());
    }

    @Test 
    @DisplayName("Test Add")
    void testAdd() {
        CalculatorClassActivity calculatorClassActivity = new CalculatorClassActivity();
        calculatorClassActivity.add(7);
        int expectedValue = 7;
        assertEquals(expectedValue, calculatorClassActivity.getValue());
    }

    @Test
    @DisplayName("Test Subtract")
    void testSubtract() {
        CalculatorClassActivity calculatorClassActivity = new CalculatorClassActivity();
        calculatorClassActivity.subtract(10);
        int expectedValue = -10;
        assertEquals(expectedValue, calculatorClassActivity.getValue());
    }
}
