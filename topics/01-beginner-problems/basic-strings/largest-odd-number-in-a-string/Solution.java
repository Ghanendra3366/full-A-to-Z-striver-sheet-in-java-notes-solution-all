import java.util.*;

public class Solution {
  public static String solve(String s) {
    for (int i = s.length() - 1; i >= 0; i--)
      if ((s.charAt(i) - '0') % 2 == 1) return s.substring(0, i + 1);
    return "";
  }

  public static void main(String[] args) {
    System.out.println(solve("35420"));
  }
}
