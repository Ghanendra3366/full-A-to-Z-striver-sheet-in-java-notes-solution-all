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

  public static int solve(int n, int[][] edges) {
    if (n <= 1) return 0;
    if (edges.length < n - 1) return -1;
    DSU d = new DSU(n);
    int components = n;
    for (int[] e : edges) if (d.union(e[0], e[1])) components--;
    return components - 1;
  }

  public static void main(String[] args) {
    System.out.println(solve(4, new int[][] {{0, 1}, {0, 2}, {1, 2}}));
  }
}
