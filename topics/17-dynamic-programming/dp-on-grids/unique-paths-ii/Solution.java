import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(int[][] a) {
    if (a.length == 0 || a[0].length == 0) return BigInteger.ZERO;
    BigInteger[] d = new BigInteger[a[0].length];
    Arrays.fill(d, BigInteger.ZERO);
    d[0] = BigInteger.ONE;
    for (int[] row : a)
      for (int c = 0; c < d.length; c++) {
        if (row[c] == 1) d[c] = BigInteger.ZERO;
        else if (c > 0) d[c] = d[c].add(d[c - 1]);
      }
    return d[d.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
  }
}
