import java.util.*;

public class Solution {
  public static boolean solve(String text, String pattern) {
    boolean[] prev = new boolean[pattern.length() + 1];
    prev[0] = true;
    for (int j = 1; j < prev.length; j++) prev[j] = prev[j - 1] && pattern.charAt(j - 1) == '*';
    for (int i = 1; i <= text.length(); i++) {
      boolean[] next = new boolean[prev.length];
      for (int j = 1; j < next.length; j++) {
        char p = pattern.charAt(j - 1);
        next[j] =
            p == '*'
                ? next[j - 1] || prev[j]
                : (p == '?' || p == text.charAt(i - 1)) && prev[j - 1];
      }
      prev = next;
    }
    return prev[pattern.length()];
  }

  public static void main(String[] args) {
    System.out.println(solve("adceb", "*a*b"));
  }
}
