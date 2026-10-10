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

  public static long solve(int n, int[][] edges) {
    List<List<long[]>> g = weighted(n, edges, false);
    long[] dist = new long[n], ways = new long[n];
    Arrays.fill(dist, INF);
    dist[0] = 0;
    ways[0] = 1;
    PriorityQueue<long[]> q = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
    q.offer(new long[] {0, 0});
    while (!q.isEmpty()) {
      long[] p = q.poll();
      int u = (int) p[1];
      if (p[0] != dist[u]) continue;
      for (long[] e : g.get(u)) {
        if (e[1] <= 0) throw new IllegalArgumentException("positive weights required");
        int v = (int) e[0];
        long d = dist[u] + e[1];
        if (d < dist[v]) {
          dist[v] = d;
          ways[v] = ways[u];
          q.offer(new long[] {d, v});
        } else if (d == dist[v]) ways[v] = (ways[v] + ways[u]) % 1000000007L;
      }
    }
    return ways[n - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve(4, new int[][] {{0, 1, 1}, {0, 2, 1}, {1, 3, 1}, {2, 3, 1}}));
  }
}
