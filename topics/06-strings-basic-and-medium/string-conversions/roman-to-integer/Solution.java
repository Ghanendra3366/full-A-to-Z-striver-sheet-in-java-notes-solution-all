import java.util.*;

public class Solution {
  private static int value(char c) {
    switch (c) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        throw new IllegalArgumentException();
    }
  }

  public static int solve(String s) {
    int ans = 0;
    for (int i = 0; i < s.length(); i++) {
      int x = value(s.charAt(i));
      ans += i + 1 < s.length() && x < value(s.charAt(i + 1)) ? -x : x;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(solve("MCMXCIV"));
  }
}
