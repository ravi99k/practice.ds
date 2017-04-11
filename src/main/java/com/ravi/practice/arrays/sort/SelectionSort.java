package com.ravi.practice.arrays.sort;

import java.util.Arrays;

import static com.ravi.practice.util.DSUtils.compare;
import static com.ravi.practice.util.DSUtils.swap;

public class SelectionSort<T extends Comparable<T>> {

  private final T[] instance;
  private int swaps;

  public SelectionSort(T[] array) {
    instance = Arrays.copyOf(array, array.length);
  }

  public T[] execute() {

    swaps = 0;
    for(int i = 0; i < instance.length - 1; i++) {
      int minIndex = i;

      for(int j = i+1; j < instance.length; j++) {
        if(compare(instance, minIndex, j)) {
          minIndex = j;
        }
      }

      if(minIndex != i) {
        swaps++;
        swap(instance, i, minIndex);
      }
    }

    System.out.println("Number of swaps: " + swaps);
    return instance;
  }
}
