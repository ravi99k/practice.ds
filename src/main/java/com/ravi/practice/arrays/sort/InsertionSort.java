package com.ravi.practice.arrays.sort;

import java.util.Arrays;

import static com.ravi.practice.util.DSUtils.compare;
import static com.ravi.practice.util.DSUtils.swap;

public class InsertionSort<T extends Comparable<T>> {

  private final T[] instance;
  private int swaps;

  public InsertionSort(T[] array) {
    instance = Arrays.copyOf(array, array.length);
  }

  public T[] execute() {
    swaps = 0;
    for(int i = 1; i < instance.length; i++) {
      int j = i;
      while(j > 0 && compare(instance, j-1, j)) {
        swaps++;
        swap(instance, j-1, j);
        j--;
      }
    }

    System.out.println("Number of swaps: " + swaps);
    return instance;
  }
}
