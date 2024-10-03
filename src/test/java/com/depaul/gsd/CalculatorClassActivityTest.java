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
    void add() {
        assertEquals(7,c.getValue()+7);
    }

    @Test
    void subtract() {
        assertEquals(-10,c.getValue()-10);
    }

    @Test
    void getValue() {
        assertEquals(0,c.getValue());
    }
}