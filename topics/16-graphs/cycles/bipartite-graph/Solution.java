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

  public static boolean solve(int n, int[][] edges) {
    List<List<Integer>> g = graph(n, edges, false);
    int[] color = new int[n];
    Arrays.fill(color, -1);
    Queue<Integer> q = new ArrayDeque<>();
    for (int start = 0; start < n; start++)
      if (color[start] < 0) {
        color[start] = 0;
        q.offer(start);
        while (!q.isEmpty()) {
          int u = q.poll();
          for (int v : g.get(u)) {
            if (color[v] < 0) {
              color[v] = 1 - color[u];
              q.offer(v);
            } else if (color[v] == color[u]) return false;
          }
        }
      }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(solve(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
  }
}
