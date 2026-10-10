import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(int rows, int cols) {
    if (rows < 0 || cols < 0) throw new IllegalArgumentException();
    if (rows == 0 || cols == 0) return BigInteger.ZERO;
    BigInteger[] d = new BigInteger[cols];
    Arrays.fill(d, BigInteger.ZERO);
    d[0] = BigInteger.ONE;
    for (int r = 0; r < rows; r++) for (int c = 1; c < cols; c++) d[c] = d[c].add(d[c - 1]);
    return d[cols - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve(3, 7));
  }
}
