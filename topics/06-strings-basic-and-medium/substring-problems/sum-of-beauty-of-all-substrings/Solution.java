import java.util.*;

public class Solution {
  public static long solve(String s) {
    long total = 0;
    for (int l = 0; l < s.length(); l++) {
      int[] count = new int[26];
      for (int r = l; r < s.length(); r++) {
        int x = s.charAt(r) - 'a';
        if (x < 0 || x >= 26) throw new IllegalArgumentException();
        count[x]++;
        int hi = 0, lo = Integer.MAX_VALUE;
        for (int f : count)
          if (f > 0) {
            hi = Math.max(hi, f);
            lo = Math.min(lo, f);
          }
        total += hi - lo;
      }
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(solve("aabcb"));
  }
}
