package com.depaul.gsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorClassActivityTest {

    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp(){
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm the initial value is 0")
    void calculatorInitializeValueZero() {
        assertEquals(0, calculator.getValue());
    }

    @Test
    @DisplayName("Confirm adding 7 to initial value")
    void valueFiveWhenFiveAdded() {
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    @DisplayName("Confirm subtracting 10 from initial value")
    void valueWhen10Subtracted() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue());
    }
}
