import java.util.*;

public class Solution {
  public static int solve(int[] a) {
    Set<Integer> set = new HashSet<>();
    for (int x : a) set.add(x);
    int best = 0;
    for (int x : set) {
      if (x != Integer.MIN_VALUE && set.contains(x - 1)) continue;
      int len = 1, y = x;
      while (y != Integer.MAX_VALUE && set.contains(y + 1)) {
        y++;
        len++;
      }
      best = Math.max(best, len);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {100, 4, 200, 1, 3, 2}));
  }
}
