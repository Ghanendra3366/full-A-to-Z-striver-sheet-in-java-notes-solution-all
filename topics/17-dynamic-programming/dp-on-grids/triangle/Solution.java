import java.util.*;

public class Solution {
  public static long solve(int[][] a) {
    if (a.length == 0) return 0;
    long[] d = new long[a[a.length - 1].length];
    for (int i = 0; i < d.length; i++) d[i] = a[a.length - 1][i];
    for (int r = a.length - 2; r >= 0; r--)
      for (int c = 0; c < a[r].length; c++) d[c] = a[r][c] + Math.min(d[c], d[c + 1]);
    return d[0];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}}));
  }
}
