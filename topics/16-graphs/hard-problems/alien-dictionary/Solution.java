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

  public static String solve(String[] words, int alphabet) {
    List<List<Integer>> g = graph(alphabet, new int[0][], true);
    for (int i = 1; i < words.length; i++) {
      String a = words[i - 1], b = words[i];
      int j = 0;
      while (j < a.length() && j < b.length() && a.charAt(j) == b.charAt(j)) j++;
      if (j == b.length() && a.length() > b.length()) return "";
      if (j < a.length() && j < b.length()) {
        int u = a.charAt(j) - 'a', v = b.charAt(j) - 'a';
        if (!g.get(u).contains(v)) g.get(u).add(v);
      }
    }
    List<Integer> order = order(g);
    if (order.size() != alphabet) return "";
    StringBuilder out = new StringBuilder();
    for (int x : order) out.append((char) ('a' + x));
    return out.toString();
  }

  public static void main(String[] args) {
    System.out.println(solve(new String[] {"baa", "abcd", "abca", "cab", "cad"}, 4));
  }
}
