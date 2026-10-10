import java.util.*;

public class Solution {
  public static long histogram(int[] a) {
    Deque<Integer> s = new ArrayDeque<>();
    long best = 0;
    for (int i = 0; i <= a.length; i++) {
      while (!s.isEmpty() && (i == a.length || a[s.peek()] >= a[i])) {
        int j = s.pop(), left = s.isEmpty() ? -1 : s.peek();
        best = Math.max(best, (long) a[j] * (i - left - 1));
      }
      s.push(i);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(histogram(new int[] {2, 1, 5, 6, 2, 3}));
  }
}
