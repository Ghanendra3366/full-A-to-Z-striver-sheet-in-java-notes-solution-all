import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(int n) {
    if (n < 0) throw new IllegalArgumentException();
    BigInteger a = BigInteger.ONE, b = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
      BigInteger next = a.add(b);
      a = b;
      b = next;
    }
    return b;
  }

  public static void main(String[] args) {
    System.out.println(solve(5));
  }
}
