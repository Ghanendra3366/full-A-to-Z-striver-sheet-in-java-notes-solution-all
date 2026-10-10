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

  public static List<Integer> solve(int n, int[][] edges) {
    List<List<Integer>> g = graph(n, edges, true), reverse = new ArrayList<>();
    for (int i = 0; i < n; i++) reverse.add(new ArrayList<>());
    int[] degree = new int[n];
    for (int u = 0; u < n; u++)
      for (int v : g.get(u)) {
        reverse.get(v).add(u);
        degree[u]++;
      }
    Queue<Integer> q = new ArrayDeque<>();
    for (int i = 0; i < n; i++) if (degree[i] == 0) q.offer(i);
    List<Integer> out = new ArrayList<>();
    while (!q.isEmpty()) {
      int v = q.poll();
      out.add(v);
      for (int u : reverse.get(v)) if (--degree[u] == 0) q.offer(u);
    }
    Collections.sort(out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(4, new int[][] {{0, 1}, {1, 2}, {2, 1}, {0, 3}}));
  }
}
