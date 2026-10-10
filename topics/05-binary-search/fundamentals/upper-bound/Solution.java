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

  public static int solve(int[] a, int x) {
    return bound(a, x, true);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 2, 4}, 2));
  }
}
