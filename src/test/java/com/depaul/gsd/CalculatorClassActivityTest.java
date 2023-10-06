package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator tests activity: Anh Luong")
class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;
    @BeforeEach
    void setUp() { calculator = new CalculatorClassActivity(); }
    @Test
    @DisplayName("Initialization should work")
    void testInitialization() {
        assertEquals(0, calculator.getValue(),"Regular initialization should work");
    }
    @DisplayName("Simple addition should work")
    @Test
    void testAdditionOf7() {
        calculator.add(7);
        assertEquals(7, calculator.getValue(), "Regular addition should work");
    }

    @DisplayName("Simple subtraction should work")
    @Test
    void testSubtractionOf10() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue(), "Regular subtraction should work");
    }

    @DisplayName("Simple getValue should work")
    @Test
    void getValue0f7() {
        calculator.add(7);
        int num = calculator.getValue();
        assertEquals(7, num, "getValue should work");
    }
}