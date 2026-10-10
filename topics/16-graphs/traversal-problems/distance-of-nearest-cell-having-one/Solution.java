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

  static int[][] distances(int[][] a, int sourceValue) {
    int[][] dist = new int[a.length][a.length == 0 ? 0 : a[0].length];
    Queue<int[]> q = new ArrayDeque<>();
    for (int r = 0; r < a.length; r++) {
      Arrays.fill(dist[r], -1);
      for (int c = 0; c < a[0].length; c++)
        if (a[r][c] == sourceValue) {
          dist[r][c] = 0;
          q.offer(new int[] {r, c});
        }
    }
    while (!q.isEmpty()) {
      int[] p = q.poll();
      for (int d = 0; d < 4; d++) {
        int r = p[0] + DR[d], c = p[1] + DC[d];
        if (inside(a, r, c) && dist[r][c] < 0) {
          dist[r][c] = dist[p[0]][p[1]] + 1;
          q.offer(new int[] {r, c});
        }
      }
    }
    return dist;
  }

  public static int[][] solve(int[][] a) {
    return distances(a, 1);
  }

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(solve(new int[][] {{0, 0, 0}, {0, 1, 0}})));
  }
}
