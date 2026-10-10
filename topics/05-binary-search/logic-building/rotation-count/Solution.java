import java.util.*;

public class Solution {
  public static int minIndex(int[] a) {
    if (a.length == 0) throw new IllegalArgumentException();
    int l = 0, r = a.length - 1;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (a[m] > a[r]) l = m + 1;
      else r = m;
    }
    return l;
  }

  public static int solve(int[] a) {
    return minIndex(a);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {4, 5, 1, 2, 3}));
  }
}
