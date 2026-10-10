import java.math.BigInteger;
import java.util.*;

public class Solution {
  static BigInteger count(int[] a, int target) {
    if (target < 0) return BigInteger.ZERO;
    BigInteger[] d = new BigInteger[target + 1];
    Arrays.fill(d, BigInteger.ZERO);
    d[0] = BigInteger.ONE;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      for (int s = target; s >= x; s--) d[s] = d[s].add(d[s - x]);
    }
    return d[target];
  }

  public static BigInteger solve(int[] a, int target) {
    return count(a, target);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {0, 0, 1}, 1));
  }
}
