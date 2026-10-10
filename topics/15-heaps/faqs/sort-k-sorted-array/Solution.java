import java.util.*;

public class Solution {
  public static int[] solve(int[] a, int k) {
    if (k < 0) throw new IllegalArgumentException();
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int read = 0, write = 0;
    while (read < a.length && read <= k) q.offer(a[read++]);
    while (!q.isEmpty()) {
      a[write++] = q.poll();
      if (read < a.length) q.offer(a[read++]);
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {3, 1, 2, 5, 4}, 2)));
  }
}
