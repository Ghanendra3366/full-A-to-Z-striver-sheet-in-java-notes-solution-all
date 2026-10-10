import java.util.*;

public class Solution {
  static final long INF = Long.MAX_VALUE / 4;

  static List<List<long[]>> weighted(int n, int[][] edges, boolean directed) {
    List<List<long[]>> g = new ArrayList<>();
    for (int i = 0; i < n; i++) g.add(new ArrayList<>());
    for (int[] e : edges) {
      g.get(e[0]).add(new long[] {e[1], e[2]});
      if (!directed) g.get(e[1]).add(new long[] {e[0], e[2]});
    }
    return g;
  }

  static long[] dijkstra(int n, int[][] edges, int source, boolean directed) {
    List<List<long[]>> g = weighted(n, edges, directed);
    long[] d = new long[n];
    Arrays.fill(d, INF);
    d[source] = 0;
    PriorityQueue<long[]> q = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
    q.offer(new long[] {0, source});
    while (!q.isEmpty()) {
      long[] p = q.poll();
      int u = (int) p[1];
      if (p[0] != d[u]) continue;
      for (long[] e : g.get(u)) {
        if (e[1] < 0) throw new IllegalArgumentException("nonnegative weights required");
        int v = (int) e[0];
        long next = d[u] + e[1];
        if (next < d[v]) {
          d[v] = next;
          q.offer(new long[] {next, v});
        }
      }
    }
    return d;
  }

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

  public static long[] solve(int n, int[][] edges, int source) {
    List<Integer> order = order(graph(n, edges, true));
    if (order.size() != n) throw new IllegalArgumentException("DAG required");
    List<List<long[]>> g = weighted(n, edges, true);
    long[] d = new long[n];
    Arrays.fill(d, INF);
    d[source] = 0;
    for (int u : order)
      if (d[u] != INF)
        for (long[] e : g.get(u)) d[(int) e[0]] = Math.min(d[(int) e[0]], d[u] + e[1]);
    return d;
  }

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(solve(3, new int[][] {{0, 1, 2}, {0, 2, 5}, {1, 2, -1}}, 0)));
  }
}
