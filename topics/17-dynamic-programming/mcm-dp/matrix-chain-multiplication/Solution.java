import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(int[] dims) {
    if (dims.length < 2) return BigInteger.ZERO;
    for (int x : dims) if (x <= 0) throw new IllegalArgumentException();
    int n = dims.length - 1;
    BigInteger[][] d = new BigInteger[n][n];
    for (int i = 0; i < n; i++) d[i][i] = BigInteger.ZERO;
    for (int len = 2; len <= n; len++)
      for (int i = 0; i + len <= n; i++) {
        int j = i + len - 1;
        for (int k = i; k < j; k++) {
          BigInteger cost =
              d[i][k]
                  .add(d[k + 1][j])
                  .add(
                      BigInteger.valueOf(dims[i])
                          .multiply(BigInteger.valueOf(dims[k + 1]))
                          .multiply(BigInteger.valueOf(dims[j + 1])));
          if (d[i][j] == null || cost.compareTo(d[i][j]) < 0) d[i][j] = cost;
        }
      }
    return d[0][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {40, 20, 30, 10, 30}));
  }
}
