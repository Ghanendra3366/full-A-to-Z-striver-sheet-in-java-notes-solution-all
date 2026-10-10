import java.util.*;

public class Solution {
  public static int solve(String a, String b) {
    int[] prev = new int[b.length() + 1];
    int best = 0;
    for (int i = 1; i <= a.length(); i++) {
      int[] next = new int[prev.length];
      for (int j = 1; j <= b.length(); j++)
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          next[j] = 1 + prev[j - 1];
          best = Math.max(best, next[j]);
        }
      prev = next;
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve("abcdxyz", "xyzabcd"));
  }
}
