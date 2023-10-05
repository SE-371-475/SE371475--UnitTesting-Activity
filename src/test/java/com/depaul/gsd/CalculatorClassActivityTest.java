package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity calculatorClassActivity = new CalculatorClassActivity();

//    @BeforeEach
//    void setUp(){
//        calculatorClassActivity = new CalculatorClassActivity();
//    }

    @Test
    @DisplayName("Test add")
    void testAdd() {
        calculatorClassActivity.add(7);
        assertEquals(7,calculatorClassActivity.getValue());

    }

    @Test
    @DisplayName("Test subtract")
    void testSubtract() {
        calculatorClassActivity.subtract(10);
        assertEquals(-10,calculatorClassActivity.getValue());
    }

    @Test
    @DisplayName("Test initial value")
    void testGetValue() {
        assertEquals(0, calculatorClassActivity.getValue(), "Initial value is 0");
    }
}