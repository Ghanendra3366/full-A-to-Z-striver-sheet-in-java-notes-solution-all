import java.util.*;

public class Solution {
  public static boolean solve(String s) {
    int low = 0, high = 0;
    for (char c : s.toCharArray()) {
      if (c == '(') {
        low++;
        high++;
      } else if (c == ')') {
        low--;
        high--;
      } else if (c == '*') {
        low--;
        high++;
      } else throw new IllegalArgumentException();
      if (high < 0) return false;
      low = Math.max(low, 0);
    }
    return low == 0;
  }

  public static void main(String[] args) {
    System.out.println(solve("(*))"));
  }
}
