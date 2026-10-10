import java.util.*;

public class Solution {
  public static int solve(boolean[][] knows) {
    int n = knows.length;
    if (n == 0) return -1;
    int candidate = 0;
    for (int i = 1; i < n; i++) if (knows[candidate][i]) candidate = i;
    for (int i = 0; i < n; i++)
      if (i != candidate && (knows[candidate][i] || !knows[i][candidate])) return -1;
    return candidate;
  }

  public static void main(String[] args) {
    System.out.println(
        solve(new boolean[][] {{false, true, false}, {false, false, false}, {false, true, false}}));
  }
}
