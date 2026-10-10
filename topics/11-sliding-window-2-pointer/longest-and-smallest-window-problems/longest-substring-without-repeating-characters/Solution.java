import java.util.*;

public class Solution {
  public static int solve(String s) {
    Map<Character, Integer> last = new HashMap<>();
    int l = 0, best = 0;
    for (int r = 0; r < s.length(); r++) {
      char c = s.charAt(r);
      Integer previous = last.put(c, r);
      if (previous != null) l = Math.max(l, previous + 1);
      best = Math.max(best, r - l + 1);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve("abcabcbb"));
  }
}
