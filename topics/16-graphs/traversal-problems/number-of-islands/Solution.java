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
    int count = 0;
    for (int r = 0; r < a.length; r++)
      for (int c = 0; c < a[r].length; c++)
        if (a[r][c] == 1) {
          count++;
          fill(a, r, c, 1, 0);
        }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 1, 0}, {0, 0, 1}, {1, 0, 1}}));
  }
}
