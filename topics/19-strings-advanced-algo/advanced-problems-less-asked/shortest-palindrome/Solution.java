import java.util.*;

public class Solution {
  public static String solve(String s) {
    int[] a = new int[2 * s.length() + 1];
    for (int i = 0; i < s.length(); i++) a[i] = s.charAt(i);
    a[s.length()] = -1;
    for (int i = 0; i < s.length(); i++) a[s.length() + 1 + i] = s.charAt(s.length() - 1 - i);
    int[] fail = new int[a.length];
    for (int i = 1, j = 0; i < a.length; i++) {
      while (j > 0 && a[i] != a[j]) j = fail[j - 1];
      if (a[i] == a[j]) j++;
      fail[i] = j;
    }
    int palindrome = fail[a.length - 1];
    return new StringBuilder(s.substring(palindrome)).reverse().append(s).toString();
  }

  public static void main(String[] args) {
    System.out.println(solve("aacecaaa"));
  }
}
