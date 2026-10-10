import java.util.*;

public class Solution {
  public static long solve(int[][] a) {
    if (a.length == 0 || a[0].length == 0) return 0;
    long[] d = new long[a[0].length];
    for (int r = 0; r < a.length; r++)
      for (int c = 0; c < d.length; c++) {
        if (r == 0 && c == 0) d[c] = a[r][c];
        else if (r == 0) d[c] = d[c - 1] + a[r][c];
        else if (c == 0) d[c] += a[r][c];
        else d[c] = Math.min(d[c], d[c - 1]) + a[r][c];
      }
    return d[d.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
  }
}
