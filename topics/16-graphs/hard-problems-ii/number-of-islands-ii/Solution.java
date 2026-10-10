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

  public static List<Integer> solve(int rows, int cols, int[][] operations) {
    DSU d = new DSU(rows * cols);
    boolean[] land = new boolean[rows * cols];
    int count = 0;
    List<Integer> out = new ArrayList<>();
    int[] dr = {1, -1, 0, 0}, dc = {0, 0, 1, -1};
    for (int[] p : operations) {
      int id = p[0] * cols + p[1];
      if (!land[id]) {
        land[id] = true;
        count++;
        for (int k = 0; k < 4; k++) {
          int r = p[0] + dr[k], c = p[1] + dc[k];
          if (r >= 0
              && c >= 0
              && r < rows
              && c < cols
              && land[r * cols + c]
              && d.union(id, r * cols + c)) count--;
        }
      }
      out.add(count);
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(2, 2, new int[][] {{0, 0}, {1, 1}, {0, 1}, {0, 0}}));
  }
}
