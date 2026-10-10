import java.util.*;

public class Solution {
  static List<List<Integer>> graph(int n, int[][] edges, boolean directed) {
    List<List<Integer>> g = new ArrayList<>();
    for (int i = 0; i < n; i++) g.add(new ArrayList<>());
    for (int[] e : edges) {
      g.get(e[0]).add(e[1]);
      if (!directed) g.get(e[1]).add(e[0]);
    }
    return g;
  }

  static void visit(List<List<Integer>> g, int u, boolean[] seen) {
    seen[u] = true;
    for (int v : g.get(u)) if (!seen[v]) visit(g, v, seen);
  }

  static void dfs(List<List<Integer>> g, int u, boolean[] seen, List<Integer> out) {
    seen[u] = true;
    out.add(u);
    for (int v : g.get(u)) if (!seen[v]) dfs(g, v, seen, out);
  }

  public static List<Integer> solve(int n, int[][] edges) {
    List<List<Integer>> g = graph(n, edges, false);
    boolean[] seen = new boolean[n];
    List<Integer> out = new ArrayList<>();
    for (int u = 0; u < n; u++) if (!seen[u]) dfs(g, u, seen, out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(4, new int[][] {{0, 1}, {0, 2}, {1, 3}}));
  }
}
