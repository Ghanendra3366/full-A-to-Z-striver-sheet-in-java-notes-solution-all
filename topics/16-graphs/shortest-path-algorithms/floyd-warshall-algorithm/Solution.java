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

  public static long[][] allPairs(int n, int[][] edges) {
    long[][] d = new long[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(d[i], INF);
      d[i][i] = 0;
    }
    for (int[] e : edges) d[e[0]][e[1]] = Math.min(d[e[0]][e[1]], e[2]);
    for (int k = 0; k < n; k++)
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
          if (d[i][k] != INF && d[k][j] != INF) d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
    for (int i = 0; i < n; i++)
      if (d[i][i] < 0) throw new IllegalArgumentException("negative cycle");
    return d;
  }

  public static void main(String[] args) {
    System.out.println(
        Arrays.deepToString(allPairs(3, new int[][] {{0, 1, 2}, {1, 2, 3}, {2, 0, 4}})));
  }
}
