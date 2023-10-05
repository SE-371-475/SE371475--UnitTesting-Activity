package com.depaul.gsd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CalculatorClassActivityTest {

    CalculatorClassActivity calc;

    public CalculatorClassActivityTest {
        calc=new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm initial value is 0.")
    void testGetValue() {
        assertEquals(0, calc.getValue(), "Should return 0.");
    }
    @Test
    @DisplayName("Confirm addition of 7 to initial value is 7.")
    void testAdd(int number) {
        assertEquals(7, calc.add(7), "Should return 7.");
    }
    @Test
    @DisplayName("Confirm subtraction of 10 to initial value is -10.")
    void subtract(int number) {
        assertEquals(-10, calc.subtract(10), "Should return -10.");
    }
}