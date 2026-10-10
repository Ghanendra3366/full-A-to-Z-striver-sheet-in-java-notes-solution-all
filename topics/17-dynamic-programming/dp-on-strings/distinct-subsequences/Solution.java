import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(String source, String target) {
    BigInteger[] d = new BigInteger[target.length() + 1];
    Arrays.fill(d, BigInteger.ZERO);
    d[0] = BigInteger.ONE;
    for (char c : source.toCharArray())
      for (int j = target.length(); j >= 1; j--)
        if (c == target.charAt(j - 1)) d[j] = d[j].add(d[j - 1]);
    return d[target.length()];
  }

  public static void main(String[] args) {
    System.out.println(solve("rabbbit", "rabbit"));
  }
}
