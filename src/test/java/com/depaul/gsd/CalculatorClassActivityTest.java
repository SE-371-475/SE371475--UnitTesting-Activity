package com.depaul.gsd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class CalculatorClassActivityTest {

    CalculatorClassActivity calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @DisplayName("Test initial value to be 0")
    @Test
    public void testInitialValue() {
        assertEquals(0, calculator.getValue());
    }

    @DisplayName("Test adding 7 to initial value")
    @Test   
    public void testAdd() {
        calculator.add(7);
        assertEquals(7, calculator.getValue());
    }
    
    @DisplayName("Test subtracting 10 from initial value")
    @Test
    public void testSubtract() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue());
    }
    
    
}
