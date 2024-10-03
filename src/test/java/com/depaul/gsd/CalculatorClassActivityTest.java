package com.depaul.gsd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    CalculatorClassActivity calculatorClassActivity;

    @BeforeEach
    void setUp() {
        calculatorClassActivity = new CalculatorClassActivity();
    }


    @Test
    @Order(1)
    @DisplayName("Addition should work properly")
    void add() {
        int expectedResult = 7;
        int actualResult = calculatorClassActivity.getValue() + 7;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    @DisplayName("Subtraction should work properly")
    void subtract() {
        int expectedResult = -10;
        int actualResult = calculatorClassActivity.getValue() - 10;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(0)
    @DisplayName("The initial value should be set properly")
    void getValue() {
        int expected = 0;
        int actual = calculatorClassActivity.getValue();
        assertEquals(expected, actual);
    }
}