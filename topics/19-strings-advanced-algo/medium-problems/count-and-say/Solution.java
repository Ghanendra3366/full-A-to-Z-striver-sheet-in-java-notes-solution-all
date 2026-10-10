import java.util.*;

public class Solution {
  public static String solve(int n) {
    if (n < 1) throw new IllegalArgumentException();
    String s = "1";
    for (int step = 1; step < n; step++) {
      StringBuilder next = new StringBuilder();
      for (int i = 0; i < s.length(); ) {
        int j = i + 1;
        while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
        next.append(j - i).append(s.charAt(i));
        i = j;
      }
      s = next.toString();
    }
    return s;
  }

  public static void main(String[] args) {
    System.out.println(solve(5));
  }
}
