import java.util.*;

public class Solution {
  public static String solve(String[] a) {
    if (a.length == 0) return "";
    int length = a[0].length();
    for (int i = 1; i < a.length; i++) {
      length = Math.min(length, a[i].length());
      int j = 0;
      while (j < length && a[0].charAt(j) == a[i].charAt(j)) j++;
      length = j;
    }
    return a[0].substring(0, length);
  }

  public static void main(String[] args) {
    System.out.println(solve(new String[] {"flower", "flow", "flight"}));
  }
}
