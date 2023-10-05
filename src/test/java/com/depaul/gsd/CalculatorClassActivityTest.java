package com.depaul.gsd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorClassActivityTest {
    CalculatorClassActivity calculatorClassActivity;

    //  The method annotated with @BeforeEach runs before each test
    @BeforeEach
    void setUp() {
        calculatorClassActivity = new CalculatorClassActivity();
    }

@Test
@DisplayName("Mounica Init value Test")
void calculatorClassActivityInitialValueZero() {

    assertEquals(0,calculatorClassActivity.getValue(),"Init value is zero");

}

@Test
@DisplayName("Mounica Add Value Test")
void calculatorClassActivityAddValue() {

calculatorClassActivity.add(7);

    assertEquals(7,calculatorClassActivity.getValue(),"Added 7 to initial value");

}

@Test
@DisplayName("Mounica Subtract Value Test")
void calculatorClassActivitySubtractValue() {

    calculatorClassActivity.subtract(10);

    assertEquals(-10,calculatorClassActivity.getValue(),"Subtracted 7 from initial value");

}


}
