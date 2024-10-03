package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    private CalculatorClassActivity calculatorToTest;

    @BeforeEach
    void setUp() {
        calculatorToTest = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Addition of 2 simple Ints")
    void add() {
        calculatorToTest.add(7);
        assertEquals(7, calculatorToTest.getValue(), "simple addition should work");
    }

    @Test
    @DisplayName("Subtraction of 2 simple Ints")
    void subtract() {
        calculatorToTest.subtract(10);
        assertEquals(-10, calculatorToTest.getValue(), "simple subtraction should work");
    }

    @Test
    @DisplayName("Get function for member value of type Int")
    void getValue() {
        assertEquals(0, calculatorToTest.getValue(), "Initial value should be zero");
    }
}