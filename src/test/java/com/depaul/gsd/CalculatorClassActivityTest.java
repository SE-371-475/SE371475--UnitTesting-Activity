package com.depaul.gsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorClassActivityTest {


    @Test
    @DisplayName("Test Get Value 0")
    void testGetValue() {
        CalculatorClassActivity calculatorClassActivity = new CalculatorClassActivity();
        int expectedValue = 0;
        assertEquals(expectedValue, calculatorClassActivity.getValue());
    }

    @Test 
    @DisplayName("Test Add 7")
    void testAdd() {
        CalculatorClassActivity calculatorClassActivity = new CalculatorClassActivity();
        calculatorClassActivity.add(7);
        int expectedValue = 7;
        assertEquals(expectedValue, calculatorClassActivity.getValue());
    }

    @Test
    @DisplayName("Test Subtract 10")
    void testSubtract() {
        CalculatorClassActivity calculatorClassActivity = new CalculatorClassActivity();
        calculatorClassActivity.subtract(10);
        int expectedValue = -10;
        assertEquals(expectedValue, calculatorClassActivity.getValue());
    }
}
