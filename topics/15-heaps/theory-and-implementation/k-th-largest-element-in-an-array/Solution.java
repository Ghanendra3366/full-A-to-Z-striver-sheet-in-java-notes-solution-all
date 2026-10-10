import java.util.*;

public class Solution {
  public static int solve(int[] a, int k) {
    if (k < 1 || k > a.length) throw new IllegalArgumentException();
    PriorityQueue<Integer> q = new PriorityQueue<>();
    for (int x : a) {
      q.offer(x);
      if (q.size() > k) q.poll();
    }
    return q.peek();
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {3, 2, 1, 5, 6, 4}, 2));
  }
}
