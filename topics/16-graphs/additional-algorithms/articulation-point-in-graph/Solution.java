import java.util.*;

public class Solution {
  static class Analysis {
    int time;
    final int[] in, low;
    final boolean[] cut;
    final List<List<int[]>> g = new ArrayList<>();
    final List<List<Integer>> bridges = new ArrayList<>();

    Analysis(int n, int[][] edges) {
      in = new int[n];
      low = new int[n];
      cut = new boolean[n];
      Arrays.fill(in, -1);
      for (int i = 0; i < n; i++) g.add(new ArrayList<>());
      for (int id = 0; id < edges.length; id++) {
        int[] e = edges[id];
        g.get(e[0]).add(new int[] {e[1], id});
        g.get(e[1]).add(new int[] {e[0], id});
      }
      for (int u = 0; u < n; u++) if (in[u] < 0) dfs(u, -1);
    }

    void dfs(int u, int parentEdge) {
      in[u] = low[u] = time++;
      int children = 0;
      for (int[] e : g.get(u)) {
        int v = e[0];
        if (e[1] == parentEdge) continue;
        if (in[v] >= 0) low[u] = Math.min(low[u], in[v]);
        else {
          children++;
          dfs(v, e[1]);
          low[u] = Math.min(low[u], low[v]);
          if (low[v] > in[u]) bridges.add(Arrays.asList(Math.min(u, v), Math.max(u, v)));
          if (parentEdge != -1 && low[v] >= in[u]) cut[u] = true;
        }
      }
      if (parentEdge == -1 && children > 1) cut[u] = true;
    }
  }

  public static List<Integer> solve(int n, int[][] edges) {
    Analysis a = new Analysis(n, edges);
    List<Integer> out = new ArrayList<>();
    for (int u = 0; u < n; u++) if (a.cut[u]) out.add(u);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(4, new int[][] {{0, 1}, {1, 2}, {2, 0}, {2, 3}}));
  }
}
