//unit test class activity example to utilize for project 1 
package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm initial value is 0")
    void calculatorInitialValueZero() {
        assertEquals(0, calculator.getValue());

    }

    @Test
    @DisplayName("Confirm adding 7 to initial value")
    public void valueFiveWhenFiveAdded() {
        calculator.add(7);
        assertEquals(7, calculator.getValue());

    }

    @Test
    @DisplayName("Confirm subtract 10 from initial value")
    public void valueMinusTwoWhenTwoSubstracted() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue());

    }
}
// go to terminal
// git commit -m "maheen tests"
// git push origin maheen-khan
//refresh github and compare/pull req or from main branch 
// request merge my branch to base main and and creates pull req -> team reviews and accepts merge