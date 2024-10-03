package com.depaul.gsd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorClassActivityTest {
    @Test
    @DisplayName("Check the add function")
    void testAdd() {
        CalculatorClassActivity checkIt = new CalculatorClassActivity();
        checkIt.add(3);
        int actualValue = checkIt.getValue();
        int expectedValue = 3;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    @DisplayName("Check the getter function for the value.")
    void testGetValue() {
        CalculatorClassActivity checkIt = new CalculatorClassActivity();
        int actualValue = checkIt.getValue();
        int expectedValue = 0;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    @DisplayName("Check the subtract function")
    void testSubtract() {
        CalculatorClassActivity checkIt = new CalculatorClassActivity();
        checkIt.subtract(4);
        int actualValue = checkIt.getValue();
        int expectedValue = -4;
        assertEquals(actualValue, expectedValue);
    }
}
