import java.util.*;

public class Solution {
  public static int solve(int[] a, long k) {
    Map<Long, Integer> first = new HashMap<>();
    first.put(0L, -1);
    long sum = 0;
    int best = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      Integer at = first.get(sum - k);
      if (at != null) best = Math.max(best, i - at);
      first.putIfAbsent(sum, i);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, -1, 2, -2, 3}, 3));
  }
}
