package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Megan Davis: CalculatorClassActivityTest")
class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
      calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm that 5 is being added to the initial value")
    void testAdd() {
        int expected = 5;
        calculator.add(5);
        int actual = calculator.getValue();
        assertEquals(expected,actual, "the result should be 5");
    }

    @Test
    @DisplayName("Confirm that 15 is being subtracted from initial value.")
    void testSubtract() {
        int expected = -15;
        calculator.subtract(15);
        int actual = calculator.getValue();
        assertEquals(expected,actual,"should return -15");
    }
    

    @Test
    @DisplayName("Confirm that the starting value is 0.")
    void testGetValue() {
    	assertEquals(0, calculator.getValue());
    }
}



