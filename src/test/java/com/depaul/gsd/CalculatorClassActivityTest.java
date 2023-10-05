package com.depaul.gsd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class CalculatorClassActivityTest {

  CalculatorClassActivity calculator;

  @BeforeEach
  void setUp() {
    calculator = new CalculatorClassActivity();
  }

  @Test
  @DisplayName("Confirm the initial value is 0")
  void calculatorInitialValueZero() {
    assertEquals(0, calculator.getValue());
  }

  @Test
  @DisplayName("Confirm Adding 7 to initial value")
  public void valueFiveWhenFiveAdded() {
    calculator.add(7);
    assertEquals(7, calculator.getValue());
  }

  @Test
  @DisplayName("Confirm Subtracting 10 from initial value")
  public void valueMinusTwoWhenTwoSubstracted() {
    calculator.subtract(10);
    assertEquals(-10, calculator.getValue());
  }
}