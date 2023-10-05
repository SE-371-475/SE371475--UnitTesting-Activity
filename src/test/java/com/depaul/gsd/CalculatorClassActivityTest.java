package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity c;
    @BeforeEach
    void setUp() {
        c = new CalculatorClassActivity();
    }

    @Test
    void getValue() {
        assertEquals(0, c.getValue(), "Get Value should return 0");
    }

    @Test
    void add() {
        c.add(7);
        assertEquals(7, c.getValue(), "Add should work");
    }

    @Test
    void subtract() {
        c.subtract(10);
        assertEquals(-10, c.getValue(), "Subtract should work");
    }

}