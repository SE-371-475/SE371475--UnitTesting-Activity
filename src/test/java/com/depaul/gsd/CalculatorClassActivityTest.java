package com.depaul.gsd;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



@DisplayName("John Smillie: Testing CalculatorClassActivity")
public class CalculatorClassActivityTest {
  CalculatorClassActivity c1;
  @BeforeEach
    void setUp() {
        c1 = new CalculatorClassActivity();
    }


  @Test
  @DisplayName("Initial value is 0")
  public void initToZero(){ 
    assertEquals(0, c1.getValue());
  }

  @Test
  @DisplayName("Adding 7 to initial value")
  public void adding(){
    assertEquals(7, c1.getValue() + 7);
  }
  @Test
  @DisplayName("Substracting 10 from initial value")
  public void substracting(){
    assertEquals(-10, c1.getValue()-10);
  }
}
