import java.util.*;

public class Solution {
  static long digits(String s, int at, long value, long limit) {
    if (at == s.length() || s.charAt(at) < '0' || s.charAt(at) > '9') return value;
    int digit = s.charAt(at) - '0';
    if (value > (limit - digit) / 10) return limit;
    return digits(s, at + 1, value * 10 + digit, limit);
  }

  public static int solve(String s) {
    int i = 0, sign = 1;
    while (i < s.length() && s.charAt(i) == ' ') i++;
    if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
      sign = s.charAt(i++) == '-' ? -1 : 1;
    return (int) (sign * digits(s, i, 0, sign == 1 ? 2147483647L : 2147483648L));
  }

  public static void main(String[] args) {
    System.out.println(solve(" -2147483649"));
  }
}
