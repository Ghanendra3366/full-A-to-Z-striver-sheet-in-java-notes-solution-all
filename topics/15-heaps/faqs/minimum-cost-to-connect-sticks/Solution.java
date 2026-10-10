import java.util.*;

public class Solution {
  public static long solve(int[] a) {
    PriorityQueue<Long> q = new PriorityQueue<>();
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      q.offer((long) x);
    }
    long cost = 0;
    while (q.size() > 1) {
      long joined = q.poll() + q.poll();
      cost += joined;
      q.offer(joined);
    }
    return cost;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 4, 3}));
  }
}
