import java.util.*;

public class Solution {
  public static int solve(String a, String b) {
    int[] prev = new int[b.length() + 1];
    for (int j = 0; j < prev.length; j++) prev[j] = j;
    for (int i = 1; i <= a.length(); i++) {
      int[] next = new int[prev.length];
      next[0] = i;
      for (int j = 1; j < next.length; j++)
        next[j] =
            a.charAt(i - 1) == b.charAt(j - 1)
                ? prev[j - 1]
                : 1 + Math.min(prev[j - 1], Math.min(prev[j], next[j - 1]));
      prev = next;
    }
    return prev[b.length()];
  }

  public static void main(String[] args) {
    System.out.println(solve("horse", "ros"));
  }
}
