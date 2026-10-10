import java.util.*;

public class Solution {
  private static boolean dfs(boolean[][] graph, int v, int[] color, int m) {
    if (v == graph.length) return true;
    for (int c = 1; c <= m; c++) {
      boolean valid = true;
      for (int u = 0; u < graph.length; u++)
        if ((graph[v][u] || graph[u][v]) && (u == v || color[u] == c)) {
          valid = false;
          break;
        }
      if (valid) {
        color[v] = c;
        if (dfs(graph, v + 1, color, m)) return true;
        color[v] = 0;
      }
    }
    return false;
  }

  public static boolean solve(boolean[][] graph, int m) {
    if (m < 0) throw new IllegalArgumentException();
    return dfs(graph, 0, new int[graph.length], m);
  }

  public static void main(String[] args) {
    System.out.println(
        solve(new boolean[][] {{false, true, true}, {true, false, true}, {true, true, false}}, 3));
  }
}
