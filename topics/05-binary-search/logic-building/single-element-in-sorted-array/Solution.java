import java.util.*;

public class Solution {
  public static int solve(int[] a) {
    if (a.length == 0) throw new IllegalArgumentException();
    int l = 0, r = a.length - 1;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (m % 2 == 1) m--;
      if (a[m] == a[m + 1]) l = m + 2;
      else r = m;
    }
    return a[l];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 1, 2, 3, 3, 4, 4}));
  }
}
