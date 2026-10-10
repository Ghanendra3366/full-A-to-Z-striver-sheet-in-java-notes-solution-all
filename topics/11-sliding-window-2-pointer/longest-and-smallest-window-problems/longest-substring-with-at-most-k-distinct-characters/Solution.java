import java.util.*;

public class Solution {
  public static int solve(String s, int k) {
    if (k <= 0) return 0;
    Map<Character, Integer> count = new HashMap<>();
    int l = 0, best = 0;
    for (int r = 0; r < s.length(); r++) {
      char c = s.charAt(r);
      count.put(c, count.getOrDefault(c, 0) + 1);
      while (count.size() > k) {
        char x = s.charAt(l++);
        int f = count.get(x) - 1;
        if (f == 0) count.remove(x);
        else count.put(x, f);
      }
      best = Math.max(best, r - l + 1);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve("eceba", 2));
  }
}
