import java.util.*;

public class Solution {
  public static int solve(int[] a, long hours) {
    int max = 0, positive = 0;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      max = Math.max(max, x);
      if (x > 0) positive++;
    }
    if (positive == 0) return 0;
    if (hours < positive) return -1;
    int l = 1, r = max;
    while (l < r) {
      int m = l + (r - l) / 2;
      long needed = 0;
      for (int x : a) needed += ((long) x + m - 1) / m;
      if (needed <= hours) r = m;
      else l = m + 1;
    }
    return l;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {3, 6, 7, 11}, 8));
  }
}
