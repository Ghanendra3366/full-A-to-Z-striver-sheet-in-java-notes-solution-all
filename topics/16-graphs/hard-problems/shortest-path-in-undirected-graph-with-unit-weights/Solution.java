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

  public static int[] solve(int n, int[][] edges, int source) {
    List<List<Integer>> g = graph(n, edges, false);
    int[] d = new int[n];
    Arrays.fill(d, -1);
    Queue<Integer> q = new ArrayDeque<>();
    d[source] = 0;
    q.offer(source);
    while (!q.isEmpty()) {
      int u = q.poll();
      for (int v : g.get(u))
        if (d[v] < 0) {
          d[v] = d[u] + 1;
          q.offer(v);
        }
    }
    return d;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(4, new int[][] {{0, 1}, {1, 2}}, 0)));
  }
}
