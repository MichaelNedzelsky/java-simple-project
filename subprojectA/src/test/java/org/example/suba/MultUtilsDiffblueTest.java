package org.example.suba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MultUtilsDiffblueTest {
  /**
   * Method under test: {@link MultUtils#mult(int, int)}
   */
  @Test
  void testMult() {
    // Arrange, Act and Assert
    assertEquals(6, MultUtils.mult(2, 3));
    assertEquals(9, MultUtils.mult(3, 3));
    assertEquals(3, MultUtils.mult(1, 3));
    assertEquals(0, MultUtils.mult(0, 3));
  }

  /**
   * Method under test: {@link MultUtils#mod(int, int)}
   */
  @Test
  void testMod() {
    // Arrange, Act and Assert
    assertEquals(2, MultUtils.mod(2, 3));
    assertEquals(0, MultUtils.mod(3, 3));
    assertEquals(1, MultUtils.mod(1, 3));
    assertEquals(0, MultUtils.mod(0, 3));
  }

  /**
   * Method under test: {@link MultUtils#quotient(int, int)}
   */
  @Test
  void testQuotient() {
    // Arrange, Act and Assert
    assertTrue(MultUtils.quotient(2, 3));
    assertFalse(MultUtils.quotient(Integer.MIN_VALUE, 3));
  }

  /**
   * Method under test: {@link MultUtils#isPrime(int)}
   */
  @Test
  void testIsPrime() {
    // Arrange, Act and Assert
    assertTrue(MultUtils.isPrime(2));
    assertFalse(MultUtils.isPrime(1));
    assertTrue(MultUtils.isPrime(3));
    assertFalse(MultUtils.isPrime(4));
  }
}
