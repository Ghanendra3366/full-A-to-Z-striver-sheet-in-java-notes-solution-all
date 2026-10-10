import java.util.*;

public class Solution {
  public static boolean solve(String s, Set<String> words) {
    boolean[] d = new boolean[s.length() + 1];
    d[0] = true;
    int max = 0;
    for (String w : words) max = Math.max(max, w.length());
    for (int end = 1; end <= s.length(); end++)
      for (int start = Math.max(0, end - max); start < end; start++)
        if (d[start] && words.contains(s.substring(start, end))) {
          d[end] = true;
          break;
        }
    return d[s.length()];
  }

  public static void main(String[] args) {
    System.out.println(solve("leetcode", new HashSet<>(Arrays.asList("leet", "code"))));
  }
}
