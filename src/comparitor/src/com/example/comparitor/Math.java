package com.example.comparitor;

import com.google.common.primitives.Ints;

/**
 * This application compares two numbers, using the Ints.compare
 * method from Guava.
 */
public class Math {

  public static int compare(int a, int b) {
    return Ints.compare(a, b);
  }

}
