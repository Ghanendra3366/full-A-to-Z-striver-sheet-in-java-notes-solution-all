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

  public static long solve(int n, int[][] input) {
    if (n == 0) return 0;
    int[][] edges = input.clone();
    Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));
    DSU d = new DSU(n);
    long sum = 0;
    int used = 0;
    for (int[] e : edges)
      if (d.union(e[0], e[1])) {
        sum += e[2];
        used++;
      }
    if (used != n - 1) throw new IllegalArgumentException("disconnected graph has no MST");
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(solve(3, new int[][] {{0, 1, 5}, {1, 2, 2}, {0, 2, 1}}));
  }
}
