import java.util.*;

public class Solution {
  public static long solve(int[] a, int k) {
    if (k < 1) throw new IllegalArgumentException();
    long[] d = new long[a.length + 1];
    for (int i = a.length - 1; i >= 0; i--) {
      long best = Long.MIN_VALUE;
      int max = Integer.MIN_VALUE;
      for (int j = i; j < a.length && j - i < k; j++) {
        max = Math.max(max, a[j]);
        best = Math.max(best, (long) max * (j - i + 1) + d[j + 1]);
      }
      d[i] = best;
    }
    return d[0];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 15, 7, 9, 2, 5, 10}, 3));
  }
}
