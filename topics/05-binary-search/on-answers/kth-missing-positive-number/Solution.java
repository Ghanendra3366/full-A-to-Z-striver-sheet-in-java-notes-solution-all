import java.util.*;

public class Solution {
  public static int solve(int[] a, int k) {
    if (k <= 0) throw new IllegalArgumentException();
    int l = 0, r = a.length;
    while (l < r) {
      int m = l + (r - l) / 2;
      if ((long) a[m] - m - 1 < k) l = m + 1;
      else r = m;
    }
    long ans = (long) l + k;
    if (ans > Integer.MAX_VALUE) throw new ArithmeticException();
    return (int) ans;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 3, 4, 7, 11}, 5));
  }
}
