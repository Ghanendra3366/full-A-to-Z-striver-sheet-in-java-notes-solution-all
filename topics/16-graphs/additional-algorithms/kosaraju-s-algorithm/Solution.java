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

  static void finish(List<List<Integer>> g, int u, boolean[] seen, List<Integer> out) {
    seen[u] = true;
    for (int v : g.get(u)) if (!seen[v]) finish(g, v, seen, out);
    out.add(u);
  }

  public static int solve(int n, int[][] edges) {
    List<List<Integer>> g = graph(n, edges, true), rev = graph(n, new int[0][], true);
    for (int[] e : edges) rev.get(e[1]).add(e[0]);
    boolean[] seen = new boolean[n];
    List<Integer> order = new ArrayList<>();
    for (int u = 0; u < n; u++) if (!seen[u]) finish(g, u, seen, order);
    Arrays.fill(seen, false);
    Collections.reverse(order);
    int count = 0;
    for (int u : order)
      if (!seen[u]) {
        count++;
        visit(rev, u, seen);
      }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve(4, new int[][] {{0, 1}, {1, 2}, {2, 0}, {2, 3}}));
  }
}
