import java.util.*;

public class Solution {
  static class StackDS {
    final int[] a;
    int size;

    StackDS(int capacity) {
      if (capacity < 0) throw new IllegalArgumentException();
      a = new int[capacity];
    }

    void push(int x) {
      if (size == a.length) throw new IllegalStateException("full");
      a[size++] = x;
    }

    int pop() {
      if (size == 0) throw new NoSuchElementException();
      return a[--size];
    }
  }

  public static void main(String[] args) {
    StackDS s = new StackDS(3);
    s.push(1);
    s.push(2);
    System.out.println(s.pop());
  }
}
