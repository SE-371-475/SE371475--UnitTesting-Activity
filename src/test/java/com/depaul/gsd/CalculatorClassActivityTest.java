package com.depaul.gsd;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Aura: method with CCA")
class CalculatorClassActivityTest {
    CalculatorClassActivity calculatorClassActivity;

    @BeforeEach
    void setUp() { calculatorClassActivity = new CalculatorClassActivity(); }

    @Test
    @Order(1)
    @DisplayName("Ensures that inital value is 0")
    void initiateValue() {
        assertEquals(0, calculatorClassActivity.getValue(), "Initial value should be 0");
    }

    @Test
    @Order(2)
    @DisplayName("Tests addition method")
    void adding() {
        calculatorClassActivity.add(7);
        int expected = 7;
        int actual = calculatorClassActivity.getValue();

        assertEquals(expected, actual, "simple addition 7 from 0 should be 7");
    }

    @Test
    @Order(3)
    @DisplayName("Test subtraction method")
    void subtracting() {
        calculatorClassActivity.subtract(10);
        int expected = -10;
        int actual = calculatorClassActivity.getValue();

        assertEquals(expected, actual, "simple subtraction 10 from 0 should be -10");
    }

}
