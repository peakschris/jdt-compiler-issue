package com.example.comparitor;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class TestMath {

  @Test
  public void testCompare() throws Exception {
    Math math = new Math();
    assertEquals("should return 0 when both numbers are equal", 0, math.compare(1, 1));
  }

}
