package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    CalculatorClassActivity c;
    @BeforeEach
    void setUp() {
        c = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Test case for adding 7 to the intitial value")
    void add() {
        assertEquals(7,c.getValue()+7);
    }

    @Test
    @DisplayName("Test case for subtracting 10 from the initial value")
    void subtract() {
        int expectedValue=-10;
        int actualValue=c.getValue()-10;
        assertEquals(expectedValue,actualValue);
    }

    @Test
    @DisplayName("Test case to test initial value")
    void getValue() {
        int expectedValue=0;
        int actualValue=c.getValue();
        assertEquals(expectedValue,actualValue);
    }
}