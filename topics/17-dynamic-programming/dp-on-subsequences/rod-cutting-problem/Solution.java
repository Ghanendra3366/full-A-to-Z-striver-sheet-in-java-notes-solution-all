import java.util.*;

public class Solution {
  public static long solve(int[] prices) {
    long[] d = new long[prices.length + 1];
    Arrays.fill(d, Long.MIN_VALUE / 4);
    d[0] = 0;
    for (int length = 1; length <= prices.length; length++)
      for (int cut = 1; cut <= length; cut++)
        d[length] = Math.max(d[length], prices[cut - 1] + d[length - cut]);
    return d[prices.length];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 5, 7, 8, 10}));
  }
}
