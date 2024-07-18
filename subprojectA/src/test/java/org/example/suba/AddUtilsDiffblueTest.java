package org.example.suba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AddUtilsDiffblueTest {
  /**
   * Method under test: {@link AddUtils#sum(int, int)}
   */
  @Test
  void testSum() {
    // Arrange, Act and Assert
    assertEquals(5, AddUtils.sum(2, 3));
    assertEquals(6, AddUtils.sum(3, 3));
    assertEquals(4, AddUtils.sum(1, 3));
    assertEquals(3, AddUtils.sum(0, 3));
  }

  /**
   * Method under test: {@link AddUtils#diff(int, int)}
   */
  @Test
  void testDiff() {
    // Arrange, Act and Assert
    assertEquals(-1, AddUtils.diff(2, 3));
    assertEquals(0, AddUtils.diff(3, 3));
    assertEquals(-2, AddUtils.diff(1, 3));
    assertEquals(-3, AddUtils.diff(0, 3));
  }

  /**
   * Method under test: {@link AddUtils#isOdd(int)}
   */
  @Test
  void testIsOdd() {
    // Arrange, Act and Assert
    assertFalse(AddUtils.isOdd(2));
    assertTrue(AddUtils.isOdd(1));
  }

  /**
   * Method under test: {@link AddUtils#isEven(int)}
   */
  @Test
  void testIsEven() {
    // Arrange, Act and Assert
    assertTrue(AddUtils.isEven(2));
    assertFalse(AddUtils.isEven(1));
  }
}
