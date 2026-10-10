import java.util.*;

public class Solution {
  public static int bound(int[] a, int x, boolean upper) {
    int l = 0, r = a.length;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (a[m] < x || upper && a[m] == x) l = m + 1;
      else r = m;
    }
    return l;
  }

  public static int solve(int[][] a) {
    int best = -1, count = 0;
    for (int r = 0; r < a.length; r++) {
      int ones = a[r].length - bound(a[r], 1, false);
      if (ones > count) {
        count = ones;
        best = r;
      }
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{0, 0, 1}, {0, 1, 1}, {0, 0, 0}}));
  }
}
