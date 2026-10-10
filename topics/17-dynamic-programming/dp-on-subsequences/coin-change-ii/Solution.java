import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(int[] coins, int target) {
    if (target < 0) throw new IllegalArgumentException();
    Set<Integer> seen = new HashSet<>();
    BigInteger[] d = new BigInteger[target + 1];
    Arrays.fill(d, BigInteger.ZERO);
    d[0] = BigInteger.ONE;
    for (int coin : coins) {
      if (coin <= 0 || !seen.add(coin))
        throw new IllegalArgumentException("distinct positive denominations required");
      for (int s = coin; s <= target; s++) d[s] = d[s].add(d[s - coin]);
    }
    return d[target];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 5}, 5));
  }
}
