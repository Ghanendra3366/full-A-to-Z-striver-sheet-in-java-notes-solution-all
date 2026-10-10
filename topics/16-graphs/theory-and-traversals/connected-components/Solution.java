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

  public static int solve(int n, int[][] edges) {
    List<List<Integer>> g = graph(n, edges, false);
    boolean[] seen = new boolean[n];
    int count = 0;
    for (int u = 0; u < n; u++)
      if (!seen[u]) {
        count++;
        visit(g, u, seen);
      }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve(5, new int[][] {{0, 1}, {1, 2}, {3, 4}}));
  }
}
