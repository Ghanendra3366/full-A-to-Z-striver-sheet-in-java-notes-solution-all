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

  public static long solve(int[][] a) {
    if (a.length == 0) return 0;
    int[] heights = new int[a[0].length];
    long best = 0;
    for (int[] row : a) {
      for (int c = 0; c < heights.length; c++) {
        if (row[c] != 0 && row[c] != 1) throw new IllegalArgumentException();
        heights[c] = row[c] == 0 ? 0 : heights[c] + 1;
      }
      best = Math.max(best, histogram(heights));
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(
        solve(new int[][] {{1, 0, 1, 0, 0}, {1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 0, 1, 0}}));
  }
}
