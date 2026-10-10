import java.util.*;

public class Solution {
  static boolean[][] palindromes(String s) {
    int n = s.length();
    boolean[][] p = new boolean[n][n];
    for (int i = n - 1; i >= 0; i--)
      for (int j = i; j < n; j++)
        p[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || p[i + 1][j - 1]);
    return p;
  }

  public static int solve(String s) {
    int n = s.length();
    if (n == 0) return 0;
    boolean[][] p = palindromes(s);
    int[] parts = new int[n + 1];
    for (int i = n - 1; i >= 0; i--) {
      parts[i] = n;
      for (int j = i; j < n; j++) if (p[i][j]) parts[i] = Math.min(parts[i], 1 + parts[j + 1]);
    }
    return parts[0] - 1;
  }

  public static void main(String[] args) {
    System.out.println(solve("aab"));
  }
}
