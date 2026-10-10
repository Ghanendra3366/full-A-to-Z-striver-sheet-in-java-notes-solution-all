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

  public static int solve(int[][] input) {
    int[][] a = copy(input);
    Queue<int[]> q = new ArrayDeque<>();
    int fresh = 0, time = 0;
    for (int r = 0; r < a.length; r++)
      for (int c = 0; c < a[r].length; c++) {
        if (a[r][c] == 2) q.offer(new int[] {r, c});
        if (a[r][c] == 1) fresh++;
      }
    while (fresh > 0 && !q.isEmpty()) {
      int size = q.size();
      boolean changed = false;
      while (size-- > 0) {
        int[] p = q.poll();
        for (int d = 0; d < 4; d++) {
          int r = p[0] + DR[d], c = p[1] + DC[d];
          if (inside(a, r, c) && a[r][c] == 1) {
            a[r][c] = 2;
            fresh--;
            changed = true;
            q.offer(new int[] {r, c});
          }
        }
      }
      if (changed) time++;
    }
    return fresh == 0 ? time : -1;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
  }
}
