import java.util.*;

public class Solution {
  public static long solve(int[][] a) {
    if (a.length == 0 || a[0].length == 0) return 0;
    int cols = a[0].length;
    long[][] prev = new long[cols][cols];
    for (int x = 0; x < cols; x++)
      for (int y = 0; y < cols; y++)
        prev[x][y] = a[a.length - 1][x] + (x == y ? 0L : a[a.length - 1][y]);
    for (int r = a.length - 2; r >= 0; r--) {
      long[][] next = new long[cols][cols];
      for (int x = 0; x < cols; x++)
        for (int y = 0; y < cols; y++) {
          long best = Long.MIN_VALUE;
          for (int dx = -1; dx <= 1; dx++)
            for (int dy = -1; dy <= 1; dy++)
              if (x + dx >= 0 && y + dy >= 0 && x + dx < cols && y + dy < cols)
                best = Math.max(best, prev[x + dx][y + dy]);
          next[x][y] = best + a[r][x] + (x == y ? 0L : a[r][y]);
        }
      prev = next;
    }
    return prev[0][cols - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}}));
  }
}
