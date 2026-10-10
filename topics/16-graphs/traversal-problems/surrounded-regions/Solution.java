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

  static void removeBorder(int[][] a) {
    if (a.length == 0 || a[0].length == 0) return;
    int m = a.length, n = a[0].length;
    for (int r = 0; r < m; r++) {
      fill(a, r, 0, 1, 0);
      fill(a, r, n - 1, 1, 0);
    }
    for (int c = 0; c < n; c++) {
      fill(a, 0, c, 1, 0);
      fill(a, m - 1, c, 1, 0);
    }
  }

  public static char[][] solve(char[][] board) {
    if (board.length == 0) return board;
    int[][] a = new int[board.length][board[0].length];
    for (int r = 0; r < a.length; r++)
      for (int c = 0; c < a[0].length; c++) a[r][c] = board[r][c] == 'O' ? 1 : 0;
    removeBorder(a);
    for (int r = 0; r < a.length; r++)
      for (int c = 0; c < a[0].length; c++) if (a[r][c] == 1) board[r][c] = 'X';
    return board;
  }

  public static void main(String[] args) {
    System.out.println(
        Arrays.deepToString(
            solve(new char[][] {{'X', 'X', 'X'}, {'X', 'O', 'X'}, {'X', 'X', 'X'}})));
  }
}
