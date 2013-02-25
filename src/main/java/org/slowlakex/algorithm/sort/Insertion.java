package org.slowlakex.algorithm.sort;

import java.util.Random;

public class Insertion<T extends Comparable<T>> extends Sorter<T> {
  
  public void sort(T[] a) {
    int n = a.length;
    for (int i = 1; i < n; ++i) {
      for (int j = i; j > 0; --j) {
        if (!less(a[j - 1], a[j])) {
          exchange(a, j - 1, j);
        }
      }
    }
  }
  
  public static void main(String[] args) {
    Sorter<Double> s = new Insertion<Double>();
    
    int n = 10;
    Double a[] = new Double[n];
    Random rand = new Random();
    for (int i = 0; i < a.length; ++i) {
      a[i] = rand.nextDouble();
    }
    
    s.dryrun(a);
  }
}
