import java.util.*;

public class Solution {
  public static int[] lps(String s) {
    int[] a = new int[s.length()];
    for (int i = 1, len = 0; i < s.length(); ) {
      if (s.charAt(i) == s.charAt(len)) a[i++] = ++len;
      else if (len > 0) len = a[len - 1];
      else a[i++] = 0;
    }
    return a;
  }

  public static List<Integer> solve(String text, String pattern) {
    List<Integer> out = new ArrayList<>();
    if (pattern.isEmpty()) {
      for (int i = 0; i <= text.length(); i++) out.add(i);
      return out;
    }
    int[] fail = lps(pattern);
    for (int i = 0, j = 0; i < text.length(); ) {
      if (text.charAt(i) == pattern.charAt(j)) {
        i++;
        j++;
        if (j == pattern.length()) {
          out.add(i - j);
          j = fail[j - 1];
        }
      } else if (j > 0) j = fail[j - 1];
      else i++;
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve("ababa", "aba"));
  }
}
