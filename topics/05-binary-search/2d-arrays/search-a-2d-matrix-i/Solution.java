import java.util.*;

public class Solution {
  public static boolean solve(int[][] a, int x) {
    if (a.length == 0 || a[0].length == 0) return false;
    int n = a[0].length;
    long l = 0, r = (long) a.length * n - 1;
    while (l <= r) {
      long m = l + (r - l) / 2;
      int v = a[(int) (m / n)][(int) (m % n)];
      if (v == x) return true;
      if (v < x) l = m + 1;
      else r = m - 1;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 3, 5}, {7, 9, 11}}, 9));
  }
}
