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

  public static List<Integer> solve(int n, int[][] edges, int source, int target) {
    long[] d = dijkstra(n, edges, source, false);
    if (d[target] == INF) return Collections.emptyList();
    List<List<long[]>> g = weighted(n, edges, false);
    int[] parent = new int[n];
    Arrays.fill(parent, -1);
    boolean[] seen = new boolean[n];
    Queue<Integer> q = new ArrayDeque<>();
    q.offer(source);
    seen[source] = true;
    while (!q.isEmpty()) {
      int u = q.poll();
      for (long[] e : g.get(u)) {
        int v = (int) e[0];
        if (!seen[v] && d[u] + e[1] == d[v]) {
          seen[v] = true;
          parent[v] = u;
          q.offer(v);
        }
      }
    }
    List<Integer> path = new ArrayList<>();
    for (int v = target; v != -1; v = parent[v]) path.add(v);
    Collections.reverse(path);
    return path;
  }

  public static void main(String[] args) {
    System.out.println(solve(3, new int[][] {{0, 1, 4}, {0, 2, 1}, {2, 1, 2}}, 0, 1));
  }
}
