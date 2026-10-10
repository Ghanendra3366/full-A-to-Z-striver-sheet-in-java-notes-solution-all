import java.util.*;

public class Solution {
  static final int[] DR = {1, -1, 0, 0}, DC = {0, 0, 1, -1};

  static boolean inside(int[][] a, int r, int c) {
    return r >= 0 && c >= 0 && r < a.length && c < a[0].length;
  }

  static void fill(int[][] a, int r, int c, int original, int replacement) {
    if (!inside(a, r, c) || a[r][c] != original) return;
    a[r][c] = replacement;
    for (int d = 0; d < 4; d++) fill(a, r + DR[d], c + DC[d], original, replacement);
  }

  static int[][] copy(int[][] a) {
    int[][] b = new int[a.length][];
    for (int i = 0; i < a.length; i++) b[i] = a[i].clone();
    return b;
  }

  public static long solve(int[][] a) {
    if (a.length == 0 || a[0].length == 0) return 0;
    int m = a.length, n = a[0].length;
    long[][] dist = new long[m][n];
    for (long[] row : dist) Arrays.fill(row, Long.MAX_VALUE);
    PriorityQueue<long[]> q = new PriorityQueue<>((x, y) -> Long.compare(x[0], y[0]));
    dist[0][0] = a[0][0];
    q.offer(new long[] {a[0][0], 0, 0});
    while (!q.isEmpty()) {
      long[] p = q.poll();
      int r = (int) p[1], c = (int) p[2];
      if (p[0] != dist[r][c]) continue;
      if (r == m - 1 && c == n - 1) return p[0];
      for (int k = 0; k < 4; k++) {
        int x = r + DR[k], y = c + DC[k];
        if (inside(a, x, y)) {
          long candidate = Math.max(p[0], a[x][y]);
          if (candidate < dist[x][y]) {
            dist[x][y] = candidate;
            q.offer(new long[] {candidate, x, y});
          }
        }
      }
    }
    throw new IllegalStateException();
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{0, 2}, {1, 3}}));
  }
}
