import java.util.*;

public class Solution {
  public static long solve(int[] a) {
    if (a.length == 0) throw new IllegalArgumentException();
    long end = a[0], best = a[0];
    for (int i = 1; i < a.length; i++) {
      end = Math.max(a[i], end + a[i]);
      best = Math.max(best, end);
    }
    return best;
  }

  public static long brute(int[] a) {
    if (a.length == 0) throw new IllegalArgumentException();
    long best = Long.MIN_VALUE;
    for (int l = 0; l < a.length; l++) {
      long sum = 0;
      for (int r = l; r < a.length; r++) {
        sum += a[r];
        best = Math.max(best, sum);
      }
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }
}
