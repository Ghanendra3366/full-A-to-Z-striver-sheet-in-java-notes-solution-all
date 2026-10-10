import java.math.BigInteger;
import java.util.*;

public class Solution {
  private static BigInteger dfs(int[] a, int i, long remaining) {
    if (i == a.length) return remaining == 0 ? BigInteger.ONE : BigInteger.ZERO;
    return dfs(a, i + 1, remaining).add(dfs(a, i + 1, remaining - a[i]));
  }

  public static BigInteger solve(int[] a, long k) {
    return dfs(a, 0, k);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 1}, 2));
  }
}
