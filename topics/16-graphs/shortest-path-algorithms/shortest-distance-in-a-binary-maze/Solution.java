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

  public static int solve(int[][] a, int sr, int sc, int tr, int tc) {
    if (!inside(a, sr, sc) || !inside(a, tr, tc)) throw new IllegalArgumentException();
    if (a[sr][sc] == 0 || a[tr][tc] == 0) return -1;
    int[][] d = new int[a.length][a[0].length];
    for (int[] row : d) Arrays.fill(row, -1);
    Queue<int[]> q = new ArrayDeque<>();
    q.offer(new int[] {sr, sc});
    d[sr][sc] = 0;
    while (!q.isEmpty()) {
      int[] p = q.poll();
      if (p[0] == tr && p[1] == tc) return d[tr][tc];
      for (int k = 0; k < 4; k++) {
        int r = p[0] + DR[k], c = p[1] + DC[k];
        if (inside(a, r, c) && a[r][c] == 1 && d[r][c] < 0) {
          d[r][c] = d[p[0]][p[1]] + 1;
          q.offer(new int[] {r, c});
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 1}, {0, 1}}, 0, 0, 1, 1));
  }
}
