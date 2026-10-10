import java.util.*;

public class Solution {
  public static String solve(String s, String t) {
    if (t.isEmpty()) return "";
    int[] previous = new int[s.length() + 1];
    Arrays.fill(previous, -1);
    for (int i = 1; i <= s.length(); i++)
      previous[i] = s.charAt(i - 1) == t.charAt(0) ? i - 1 : previous[i - 1];
    for (int j = 1; j < t.length(); j++) {
      int[] current = new int[s.length() + 1];
      Arrays.fill(current, -1);
      for (int i = 1; i <= s.length(); i++)
        current[i] =
            s.charAt(i - 1) == t.charAt(j) && previous[i - 1] >= 0
                ? previous[i - 1]
                : current[i - 1];
      previous = current;
    }
    int start = -1, best = Integer.MAX_VALUE;
    for (int i = 1; i <= s.length(); i++)
      if (previous[i] >= 0 && i - previous[i] < best) {
        best = i - previous[i];
        start = previous[i];
      }
    return start < 0 ? "" : s.substring(start, start + best);
  }

  public static void main(String[] args) {
    System.out.println(solve("abcdebdde", "bde"));
  }
}
