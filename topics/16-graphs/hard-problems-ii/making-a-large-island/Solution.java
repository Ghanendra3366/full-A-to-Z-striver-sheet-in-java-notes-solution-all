import java.util.*;

public class Solution {
  static class DSU {
    final int[] parent, size;

    DSU(int n) {
      parent = new int[n];
      size = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
        size[i] = 1;
      }
    }

    int find(int x) {
      while (x != parent[x]) {
        parent[x] = parent[parent[x]];
        x = parent[x];
      }
      return x;
    }

    boolean union(int a, int b) {
      a = find(a);
      b = find(b);
      if (a == b) return false;
      if (size[a] < size[b]) {
        int t = a;
        a = b;
        b = t;
      }
      parent[b] = a;
      size[a] += size[b];
      return true;
    }
  }

  public static int solve(int[][] a) {
    if (a.length == 0 || a[0].length == 0) return 0;
    int m = a.length, n = a[0].length;
    DSU d = new DSU(m * n);
    for (int r = 0; r < m; r++)
      for (int c = 0; c < n; c++)
        if (a[r][c] == 1) {
          if (r + 1 < m && a[r + 1][c] == 1) d.union(r * n + c, (r + 1) * n + c);
          if (c + 1 < n && a[r][c + 1] == 1) d.union(r * n + c, r * n + c + 1);
        }
    int best = 0;
    int[] dr = {1, -1, 0, 0}, dc = {0, 0, 1, -1};
    for (int r = 0; r < m; r++)
      for (int c = 0; c < n; c++) {
        if (a[r][c] == 1) {
          best = Math.max(best, d.size[d.find(r * n + c)]);
          continue;
        }
        Set<Integer> roots = new HashSet<>();
        for (int k = 0; k < 4; k++) {
          int x = r + dr[k], y = c + dc[k];
          if (x >= 0 && y >= 0 && x < m && y < n && a[x][y] == 1) roots.add(d.find(x * n + y));
        }
        int size = 1;
        for (int root : roots) size += d.size[root];
        best = Math.max(best, size);
      }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 0}, {0, 1}}));
  }
}
