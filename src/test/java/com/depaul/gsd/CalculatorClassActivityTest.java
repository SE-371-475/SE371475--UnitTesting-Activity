package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    CalculatorClassActivity calculator;

    @BeforeEach
    public void setUp(){
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm adding 7 to the initial value")
    void testAdd() {
        calculator.add(7);
        assertEquals(7, calculator.getValue());
    }

    @Test
    @DisplayName("Confirm subtracting 10 from initial value")
    void testSubtract() {
        calculator.subtract(10);
        assertEquals(-10,calculator.getValue());
    }

    @Test
    @DisplayName("Confirm the initial value is zero")
    void testGetValue() {
        assertEquals(0,calculator.getValue());
    }
}