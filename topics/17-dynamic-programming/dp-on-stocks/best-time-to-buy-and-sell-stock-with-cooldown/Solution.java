import java.util.*;

public class Solution {
  public static long profit(int[] prices, int k, int fee, boolean cooldown) {
    if (k < 0 || fee < 0) throw new IllegalArgumentException();
    for (int p : prices) if (p < 0) throw new IllegalArgumentException();
    k = Math.min(k, prices.length / 2);
    long[][] next = new long[2][k + 1], after = new long[2][k + 1];
    for (int i = prices.length - 1; i >= 0; i--) {
      long[][] cur = new long[2][k + 1];
      for (int t = 1; t <= k; t++) {
        cur[0][t] = Math.max(next[0][t], -((long) prices[i]) + next[1][t]);
        cur[1][t] =
            Math.max(
                next[1][t], prices[i] - (long) fee + (cooldown ? after[0][t - 1] : next[0][t - 1]));
      }
      after = next;
      next = cur;
    }
    return next[0][k];
  }

  public static void main(String[] args) {
    System.out.println(profit(new int[] {7, 1, 5, 3, 6, 4}, 3, 0, true));
  }
}
