import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(String s) {
    int n = s.length();
    if (n == 0) return BigInteger.ZERO;
    BigInteger[][] d = new BigInteger[n][n];
    for (int i = n - 1; i >= 0; i--) {
      d[i][i] = BigInteger.ONE;
      for (int j = i + 1; j < n; j++) {
        BigInteger middle = j == i + 1 ? BigInteger.ZERO : d[i + 1][j - 1];
        d[i][j] =
            s.charAt(i) == s.charAt(j)
                ? d[i + 1][j].add(d[i][j - 1]).add(BigInteger.ONE)
                : d[i + 1][j].add(d[i][j - 1]).subtract(middle);
      }
    }
    return d[0][n - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve("aaa"));
  }
}
