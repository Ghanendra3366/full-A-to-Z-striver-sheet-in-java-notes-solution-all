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

  static BigInteger subsets(int[] a, int target) {
    return count(a, target);
  }

  public static BigInteger solve(int[] a, int difference) {
    long sum = 0;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      sum += x;
    }
    long target = sum - (long) difference;
    if (target < 0 || target % 2 != 0 || target / 2 > sum) return BigInteger.ZERO;
    if (target / 2 > Integer.MAX_VALUE) throw new IllegalArgumentException();
    return count(a, (int) (target / 2));
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 1, 1, 1, 1}, 3));
  }
}
