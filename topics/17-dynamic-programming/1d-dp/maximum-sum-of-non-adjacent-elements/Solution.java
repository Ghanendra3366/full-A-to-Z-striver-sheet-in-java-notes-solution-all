import java.util.*;

public class Solution {
  static long linear(int[] a, int l, int r) {
    long prev = 0, before = 0;
    for (int i = l; i < r; i++) {
      if (a[i] < 0) throw new IllegalArgumentException();
      long next = Math.max(prev, before + a[i]);
      before = prev;
      prev = next;
    }
    return prev;
  }

  public static long solve(int[] a) {
    return linear(a, 0, a.length);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 1, 4, 9}));
  }
}
