import java.util.*;

public class Solution {
  public static int solve(int[] coins, int target) {
    if (target < 0) throw new IllegalArgumentException();
    int[] d = new int[target + 1];
    Arrays.fill(d, target + 1);
    d[0] = 0;
    for (int coin : coins) {
      if (coin <= 0) throw new IllegalArgumentException();
      for (int s = coin; s <= target; s++) d[s] = Math.min(d[s], 1 + d[s - coin]);
    }
    return d[target] > target ? -1 : d[target];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 5}, 11));
  }
}
