import java.util.*;

public class Solution {
  public static long solve(int[][] a) {
    if (a.length == 0 || a[0].length == 0) return 0;
    long[] prev = new long[a[0].length];
    for (int c = 0; c < prev.length; c++) prev[c] = a[0][c];
    for (int r = 1; r < a.length; r++) {
      long[] next = new long[prev.length];
      for (int c = 0; c < prev.length; c++) {
        long best = prev[c];
        if (c > 0) best = Math.min(best, prev[c - 1]);
        if (c + 1 < prev.length) best = Math.min(best, prev[c + 1]);
        next[c] = best + a[r][c];
      }
      prev = next;
    }
    long best = Long.MAX_VALUE;
    for (long x : prev) best = Math.min(best, x);
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));
  }
}
