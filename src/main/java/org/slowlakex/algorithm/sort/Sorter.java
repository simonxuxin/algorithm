package org.slowlakex.algorithm.sort;

public abstract class Sorter<T extends Comparable<T>> {
  public abstract void sort(T[] a);
  
  protected boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }
  
  protected void exchange(T[] a, int i, int j) {
    T t = a[i];
    a[i] = a[j];
    a[j] = t;
  }
  
  public void show(T[] a) {
    for (T i : a) {
      System.out.println(i);
    }
  }
  
  public boolean isSorted(T[] a) {
    for (int i = 1; i < a.length; i++) {
      if (less(a[i], a[i-1])) {
        return false;
      }
    }
    return true;
  }
  
  public void dryrun(T[] a) {
    System.out.println("Before:");
    show(a);
    
    sort(a);
    assert isSorted(a);
    
    System.out.println("After:");
    show(a);
  }
}
