import java.util.*;

public class Solution {
  public static int solve(int dividend, int divisor) {
    if (divisor == 0) throw new ArithmeticException("division by zero");
    if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
    long a = Math.abs((long) dividend), b = Math.abs((long) divisor), q = 0;
    for (int bit = 31; bit >= 0; bit--)
      if ((a >> bit) >= b) {
        a -= b << bit;
        q |= 1L << bit;
      }
    return (int) ((dividend < 0) ^ (divisor < 0) ? -q : q);
  }

  public static void main(String[] args) {
    System.out.println(solve(43, -8));
  }
}
