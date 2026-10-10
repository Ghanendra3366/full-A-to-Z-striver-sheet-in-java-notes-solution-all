import java.util.*;

public class Solution {
  private static void dfs(
      int r, char[][] board, boolean[] col, boolean[] down, boolean[] up, List<List<String>> out) {
    int n = board.length;
    if (r == n) {
      List<String> rows = new ArrayList<>();
      for (char[] row : board) rows.add(new String(row));
      out.add(rows);
      return;
    }
    for (int c = 0; c < n; c++)
      if (!col[c] && !down[r - c + n - 1] && !up[r + c]) {
        col[c] = down[r - c + n - 1] = up[r + c] = true;
        board[r][c] = 'Q';
        dfs(r + 1, board, col, down, up, out);
        board[r][c] = '.';
        col[c] = down[r - c + n - 1] = up[r + c] = false;
      }
  }

  public static List<List<String>> solve(int n) {
    if (n < 0) throw new IllegalArgumentException();
    char[][] b = new char[n][n];
    for (char[] row : b) Arrays.fill(row, '.');
    List<List<String>> out = new ArrayList<>();
    dfs(
        0,
        b,
        new boolean[n],
        new boolean[Math.max(0, 2 * n - 1)],
        new boolean[Math.max(0, 2 * n - 1)],
        out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(4).size());
  }
}
