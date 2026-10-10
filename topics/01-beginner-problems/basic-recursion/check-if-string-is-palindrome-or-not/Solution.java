import java.util.*;

public class Solution {
  public static boolean solve(String s, int l, int r) {
    return l >= r || (s.charAt(l) == s.charAt(r) && solve(s, l + 1, r - 1));
  }

  public static void main(String[] args) {
    System.out.println(solve("level", 0, 4));
  }
}
