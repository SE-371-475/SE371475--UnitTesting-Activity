package com.depaul.gsd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    @Test
    @DisplayName("validate initial value")
    void add() {

        CalculatorClassActivity calculator = new CalculatorClassActivity();

        assertEquals(0, calculator.getValue());

        calculator.add(5);
        assertEquals(5, calculator.getValue());

        calculator.add(2);
        assertEquals(7, calculator.getValue());

        calculator.add(-3);
        assertEquals(4, calculator.getValue());

    }

    @Test
    void subtract() {

        CalculatorClassActivity calculator = new CalculatorClassActivity();

        calculator.subtract(5);
        assertEquals(-5, calculator.getValue());

        calculator.subtract(-10);
        assertEquals(5, calculator.getValue());


    }

    @Test
    void getValue() {
        CalculatorClassActivity calculator = new CalculatorClassActivity();
        assertEquals(0, calculator.getValue());

    }
}