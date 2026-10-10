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

  public static int solve(int[][] matrix) {
    int n = matrix.length;
    List<List<Integer>> g = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      g.add(new ArrayList<>());
      for (int j = 0; j < n; j++) if (i != j && matrix[i][j] != 0) g.get(i).add(j);
    }
    boolean[] seen = new boolean[n];
    int count = 0;
    for (int i = 0; i < n; i++)
      if (!seen[i]) {
        count++;
        visit(g, i, seen);
      }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
  }
}
