import java.util.*;

public class Solution {
  public static int[] solve(int[] a, int k) {
    if (k < 1 || k > a.length) throw new IllegalArgumentException();
    int[] out = new int[a.length - k + 1];
    Deque<Integer> q = new ArrayDeque<>();
    for (int i = 0; i < a.length; i++) {
      while (!q.isEmpty() && q.peekFirst() <= i - k) q.pollFirst();
      while (!q.isEmpty() && a[q.peekLast()] <= a[i]) q.pollLast();
      q.offerLast(i);
      if (i >= k - 1) out[i - k + 1] = a[q.peekFirst()];
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3)));
  }
}
