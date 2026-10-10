import java.util.*;

public class Solution {
  public static List<Integer> solve(String text, String pattern) {
    final long mod = 1000000007L, base = 257;
    int n = text.length(), m = pattern.length();
    List<Integer> out = new ArrayList<>();
    if (m > n) return out;
    if (m == 0) {
      for (int i = 0; i <= n; i++) out.add(i);
      return out;
    }
    long high = 1, wanted = 0, current = 0;
    for (int i = 0; i < m; i++) {
      wanted = (wanted * base + pattern.charAt(i)) % mod;
      current = (current * base + text.charAt(i)) % mod;
      if (i < m - 1) high = high * base % mod;
    }
    for (int i = 0; i <= n - m; i++) {
      if (current == wanted && text.regionMatches(i, pattern, 0, m)) out.add(i);
      if (i < n - m) {
        current = (current - text.charAt(i) * high % mod + mod) % mod;
        current = (current * base + text.charAt(i + m)) % mod;
      }
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve("ababa", "aba"));
  }
}
