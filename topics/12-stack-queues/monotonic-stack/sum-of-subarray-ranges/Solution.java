import java.util.*;

public class Solution {
  static long contribution(int[] a, boolean min) {
    int n = a.length;
    Deque<Integer> s = new ArrayDeque<>();
    long sum = 0;
    for (int i = 0; i <= n; i++) {
      while (!s.isEmpty() && (i == n || (min ? a[s.peek()] >= a[i] : a[s.peek()] <= a[i]))) {
        int j = s.pop(), left = s.isEmpty() ? -1 : s.peek();
        sum += (long) a[j] * (j - left) * (i - j);
      }
      s.push(i);
    }
    return sum;
  }

  public static long solve(int[] a) {
    return contribution(a, false) - contribution(a, true);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 3}));
  }
}
