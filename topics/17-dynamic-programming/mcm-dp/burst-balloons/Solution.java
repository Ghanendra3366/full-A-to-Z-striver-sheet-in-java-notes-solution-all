import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(int[] values) {
    int n = values.length;
    BigInteger[] a = new BigInteger[n + 2];
    a[0] = a[n + 1] = BigInteger.ONE;
    for (int i = 0; i < n; i++) {
      if (values[i] < 0) throw new IllegalArgumentException();
      a[i + 1] = BigInteger.valueOf(values[i]);
    }
    BigInteger[][] d = new BigInteger[n + 2][n + 2];
    for (BigInteger[] row : d) Arrays.fill(row, BigInteger.ZERO);
    for (int len = 1; len <= n; len++)
      for (int l = 1; l + len - 1 <= n; l++) {
        int r = l + len - 1;
        for (int k = l; k <= r; k++) {
          BigInteger cost =
              d[l][k - 1].add(d[k + 1][r]).add(a[l - 1].multiply(a[k]).multiply(a[r + 1]));
          d[l][r] = d[l][r].max(cost);
        }
      }
    return d[1][n];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {3, 1, 5, 8}));
  }
}
