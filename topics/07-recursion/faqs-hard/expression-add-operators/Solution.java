import java.math.BigInteger;
import java.util.*;

public class Solution {
  private static void dfs(
      String s,
      int at,
      BigInteger value,
      BigInteger last,
      String expression,
      BigInteger target,
      List<String> out) {
    if (at == s.length()) {
      if (value.equals(target)) out.add(expression);
      return;
    }
    for (int end = at + 1; end <= s.length(); end++) {
      if (end > at + 1 && s.charAt(at) == '0') break;
      String token = s.substring(at, end);
      BigInteger x = new BigInteger(token);
      if (at == 0) dfs(s, end, x, x, token, target, out);
      else {
        dfs(s, end, value.add(x), x, expression + "+" + token, target, out);
        dfs(s, end, value.subtract(x), x.negate(), expression + "-" + token, target, out);
        BigInteger product = last.multiply(x);
        dfs(
            s,
            end,
            value.subtract(last).add(product),
            product,
            expression + "*" + token,
            target,
            out);
      }
    }
  }

  public static List<String> solve(String digits, long target) {
    for (char c : digits.toCharArray())
      if (c < '0' || c > '9') throw new IllegalArgumentException();
    List<String> out = new ArrayList<>();
    if (!digits.isEmpty())
      dfs(digits, 0, BigInteger.ZERO, BigInteger.ZERO, "", BigInteger.valueOf(target), out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve("123", 6));
  }
}
