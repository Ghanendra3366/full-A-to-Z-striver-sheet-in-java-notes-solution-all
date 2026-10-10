import java.util.*;

public class Solution {
  public static int solve(int[] a, long threshold) {
    int max = 0, positive = 0;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      max = Math.max(max, x);
      if (x > 0) positive++;
    }
    if (positive == 0) return 1;
    if (threshold < positive) return -1;
    int l = 1, r = max;
    while (l < r) {
      int m = l + (r - l) / 2;
      long sum = 0;
      for (int x : a) sum += ((long) x + m - 1) / m;
      if (sum <= threshold) r = m;
      else l = m + 1;
    }
    return l;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 5, 9}, 6));
  }
}
