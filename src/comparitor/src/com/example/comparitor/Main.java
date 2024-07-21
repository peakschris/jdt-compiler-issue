package com.example.comparitor;

import com.example.comparitor.Math;

/**
 * This application compares two numbers, using the Ints.compare
 * method from Guava.
 */
public class Main {

  public static void main(String... args) throws Exception {
    Math math = new Math();
    System.out.println("Success: " + math.compare(2, 1));
  }

}
