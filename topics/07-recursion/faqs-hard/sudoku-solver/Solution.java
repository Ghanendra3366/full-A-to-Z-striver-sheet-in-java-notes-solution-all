import java.util.*;

public class Solution {
  private static boolean valid(char[][] a, int r, int c, char x) {
    for (int i = 0; i < 9; i++)
      if (a[r][i] == x || a[i][c] == x || a[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] == x)
        return false;
    return true;
  }

  private static boolean dfs(char[][] a) {
    for (int r = 0; r < 9; r++)
      for (int c = 0; c < 9; c++)
        if (a[r][c] == '.') {
          for (char x = '1'; x <= '9'; x++)
            if (valid(a, r, c, x)) {
              a[r][c] = x;
              if (dfs(a)) return true;
              a[r][c] = '.';
            }
          return false;
        }
    return true;
  }

  public static boolean solve(char[][] a) {
    if (a.length != 9) throw new IllegalArgumentException();
    for (char[] row : a) if (row.length != 9) throw new IllegalArgumentException();
    for (int r = 0; r < 9; r++)
      for (int c = 0; c < 9; c++)
        if (a[r][c] != '.') {
          char x = a[r][c];
          a[r][c] = '.';
          boolean ok = x >= '1' && x <= '9' && valid(a, r, c, x);
          a[r][c] = x;
          if (!ok) return false;
        }
    return dfs(a);
  }

  public static void main(String[] args) {
    char[][] a = {
      "53..7....".toCharArray(),
      "6..195...".toCharArray(),
      ".98....6.".toCharArray(),
      "8...6...3".toCharArray(),
      "4..8.3..1".toCharArray(),
      "7...2...6".toCharArray(),
      ".6....28.".toCharArray(),
      "...419..5".toCharArray(),
      "....8..79".toCharArray()
    };
    System.out.println(solve(a));
    System.out.println(new String(a[0]));
  }
}
