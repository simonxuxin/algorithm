package org.slowlakex.algorithm.sort;

import java.util.Random;

public class Selection<T extends Comparable<T>> extends Sorter<T> {
  
  public void sort(T[] a) {
    int n = a.length;
    for (int i = 0; i < n; ++i) {
      int min = i;
      for (int j = i + 1; j < n; ++j) {
        if (less(a[j], a[min])) {
          min = j;
        }
      }
      exchange(a, i, min);
    }
  }
  
  public static void main(String[] args) {
    Sorter<Double> s = new Selection<Double>();
    
    int n = 10;
    Double a[] = new Double[n];
    Random rand = new Random();
    for (int i = 0; i < a.length; ++i) {
      a[i] = rand.nextDouble();
    }
    
    s.dryrun(a);
  }
}
