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

  static List<Integer> order(List<List<Integer>> g) {
    int[] degree = new int[g.size()];
    for (List<Integer> row : g) for (int v : row) degree[v]++;
    Queue<Integer> q = new ArrayDeque<>();
    for (int i = 0; i < degree.length; i++) if (degree[i] == 0) q.offer(i);
    List<Integer> out = new ArrayList<>();
    while (!q.isEmpty()) {
      int u = q.poll();
      out.add(u);
      for (int v : g.get(u)) if (--degree[v] == 0) q.offer(v);
    }
    return out;
  }

  public static boolean solve(int n, int[][] edges) {
    return order(graph(n, edges, true)).size() == n;
  }

  public static void main(String[] args) {
    System.out.println(solve(3, new int[][] {{0, 1}, {1, 2}}));
  }
}
