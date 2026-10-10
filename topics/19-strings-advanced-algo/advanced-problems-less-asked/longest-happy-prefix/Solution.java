import java.util.*;

public class Solution {
  public static int[] lps(String s) {
    int[] a = new int[s.length()];
    for (int i = 1, len = 0; i < s.length(); ) {
      if (s.charAt(i) == s.charAt(len)) a[i++] = ++len;
      else if (len > 0) len = a[len - 1];
      else a[i++] = 0;
    }
    return a;
  }

  public static String solve(String s) {
    return s.isEmpty() ? "" : s.substring(0, lps(s)[s.length() - 1]);
  }

  public static void main(String[] args) {
    System.out.println(solve("level"));
  }
}
