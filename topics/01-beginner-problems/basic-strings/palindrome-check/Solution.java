import java.util.*;

public class Solution {
  public static boolean solve(String s) {
    for (int l = 0, r = s.length() - 1; l < r; l++, r--)
      if (s.charAt(l) != s.charAt(r)) return false;
    return true;
  }

  public static void main(String[] args) {
    System.out.println(solve("level"));
  }
}
