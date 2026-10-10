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

  public static int solve(int[][] stones) {
    DSU d = new DSU(stones.length);
    Map<Integer, Integer> row = new HashMap<>(), col = new HashMap<>();
    int components = stones.length;
    for (int i = 0; i < stones.length; i++) {
      Integer a = row.putIfAbsent(stones[i][0], i), b = col.putIfAbsent(stones[i][1], i);
      if (a != null && d.union(i, a)) components--;
      if (b != null && d.union(i, b)) components--;
    }
    return stones.length - components;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}}));
  }
}
