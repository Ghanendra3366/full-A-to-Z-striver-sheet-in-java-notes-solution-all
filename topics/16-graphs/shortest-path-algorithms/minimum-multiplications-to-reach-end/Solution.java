import java.util.*;

public class Solution {
  public static int solve(int[] factors, int start, int end) {
    final int mod = 100000;
    int[] d = new int[mod];
    Arrays.fill(d, -1);
    Queue<Integer> q = new ArrayDeque<>();
    q.offer(start);
    d[start] = 0;
    while (!q.isEmpty()) {
      int u = q.poll();
      if (u == end) return d[u];
      for (int x : factors) {
        if (x < 0) throw new IllegalArgumentException();
        int v = (int) ((long) u * x % mod);
        if (d[v] < 0) {
          d[v] = d[u] + 1;
          q.offer(v);
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 5, 7}, 3, 30));
  }
}
