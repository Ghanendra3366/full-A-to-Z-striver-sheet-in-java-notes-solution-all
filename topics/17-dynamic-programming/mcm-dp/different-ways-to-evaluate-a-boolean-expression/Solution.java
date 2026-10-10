import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(String s) {
    if (s.isEmpty()) return BigInteger.ZERO;
    if (s.length() % 2 == 0) throw new IllegalArgumentException();
    int n = (s.length() + 1) / 2;
    BigInteger[][][] d = new BigInteger[n][n][2];
    for (int i = 0; i < n; i++) {
      char c = s.charAt(2 * i);
      if (c != 'T' && c != 'F') throw new IllegalArgumentException();
      d[i][i][0] = c == 'F' ? BigInteger.ONE : BigInteger.ZERO;
      d[i][i][1] = c == 'T' ? BigInteger.ONE : BigInteger.ZERO;
    }
    for (int len = 2; len <= n; len++)
      for (int l = 0; l + len <= n; l++) {
        int r = l + len - 1;
        d[l][r][0] = d[l][r][1] = BigInteger.ZERO;
        for (int k = l; k < r; k++) {
          char op = s.charAt(2 * k + 1);
          if (op != '&' && op != '|' && op != '^') throw new IllegalArgumentException();
          for (int a = 0; a < 2; a++)
            for (int b = 0; b < 2; b++) {
              int value = op == '&' ? (a & b) : op == '|' ? (a | b) : (a ^ b);
              d[l][r][value] = d[l][r][value].add(d[l][k][a].multiply(d[k + 1][r][b]));
            }
        }
      }
    return d[0][n - 1][1];
  }

  public static void main(String[] args) {
    System.out.println(solve("T|T&F^T"));
  }
}
