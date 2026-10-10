import java.util.*;

public class Solution {
  public static int solve(String s, int k) {
    if (k < 0) throw new IllegalArgumentException();
    int[] count = new int[26];
    int l = 0, best = 0;
    for (int r = 0; r < s.length(); r++) {
      int x = s.charAt(r) - 'A';
      if (x < 0 || x >= 26) throw new IllegalArgumentException();
      count[x]++;
      while (true) {
        int max = 0;
        for (int f : count) max = Math.max(max, f);
        if (r - l + 1 - max <= k) break;
        count[s.charAt(l++) - 'A']--;
      }
      best = Math.max(best, r - l + 1);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve("AABABBA", 1));
  }
}
