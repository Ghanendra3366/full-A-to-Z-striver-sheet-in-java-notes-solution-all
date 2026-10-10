import java.util.*;

public class Solution {
  static int[][] table(String a, String b) {
    int[][] d = new int[a.length() + 1][b.length() + 1];
    for (int i = 1; i <= a.length(); i++)
      for (int j = 1; j <= b.length(); j++)
        d[i][j] =
            a.charAt(i - 1) == b.charAt(j - 1)
                ? 1 + d[i - 1][j - 1]
                : Math.max(d[i - 1][j], d[i][j - 1]);
    return d;
  }

  public static int solve(String a, String b) {
    return table(a, b)[a.length()][b.length()];
  }

  public static String reconstruct(String a, String b) {
    int[][] d = table(a, b);
    int i = a.length(), j = b.length();
    StringBuilder out = new StringBuilder();
    while (i > 0 && j > 0) {
      if (a.charAt(i - 1) == b.charAt(j - 1)) {
        out.append(a.charAt(--i));
        j--;
      } else if (d[i - 1][j] >= d[i][j - 1]) i--;
      else j--;
    }
    return out.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(reconstruct("abcde", "ace"));
  }
}
