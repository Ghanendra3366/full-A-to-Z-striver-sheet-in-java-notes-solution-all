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

  public static List<Integer> solve(int n, int[][] edges, int source) {
    List<List<Integer>> g = graph(n, edges, false);
    boolean[] seen = new boolean[n];
    Queue<Integer> q = new ArrayDeque<>();
    List<Integer> out = new ArrayList<>();
    q.offer(source);
    seen[source] = true;
    while (!q.isEmpty()) {
      int u = q.poll();
      out.add(u);
      for (int v : g.get(u))
        if (!seen[v]) {
          seen[v] = true;
          q.offer(v);
        }
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(4, new int[][] {{0, 1}, {0, 2}, {1, 3}}, 0));
  }
}
