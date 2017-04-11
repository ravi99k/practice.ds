package com.ravi.practice.util;

public class DSUtils {
  public static boolean compare(final Comparable[] array, int i, int j) {
    return array[i].compareTo(array[j]) > 0;
  }

  public static void swap(Comparable[] array, int i, int j) {
    Comparable temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
