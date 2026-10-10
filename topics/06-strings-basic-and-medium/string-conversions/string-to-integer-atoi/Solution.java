import java.util.*;

public class Solution {
  public static int solve(String s) {
    int i = 0, sign = 1;
    while (i < s.length() && s.charAt(i) == ' ') i++;
    if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
      sign = s.charAt(i++) == '-' ? -1 : 1;
    long v = 0, limit = sign == 1 ? Integer.MAX_VALUE : 2147483648L;
    while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
      int d = s.charAt(i++) - '0';
      if (v > (limit - d) / 10) return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      v = v * 10 + d;
    }
    return (int) (sign * v);
  }

  public static void main(String[] args) {
    System.out.println(solve("   -42 words"));
  }
}
