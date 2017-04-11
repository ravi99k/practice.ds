package com.ravi.practice.arrays.sort;

import java.util.Arrays;

import static com.ravi.practice.util.DSUtils.compare;
import static com.ravi.practice.util.DSUtils.swap;

public class BubbleSort<T extends Comparable<T>> {

  final private T[] instance;
  private int swaps;

  public BubbleSort(T[] array) {
    instance = Arrays.copyOf(array, array.length);
  }

  public T[] execute() {
    swaps = 0;
    for(int i = instance.length; i >= 0; i--) {
      for(int j = 1; j < i; j++) {
        if(compare(instance, j-1, j)) {
          swaps++;
          swap(instance, j-1, j);
        }
      }
    }

    System.out.println("Number of swaps: " + swaps);
    return instance;
  }
}
