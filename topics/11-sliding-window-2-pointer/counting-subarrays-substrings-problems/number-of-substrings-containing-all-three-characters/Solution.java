import java.util.*;

public class Solution {
  public static long solve(String s) {
    int[] last = {-1, -1, -1};
    long count = 0;
    for (int i = 0; i < s.length(); i++) {
      int x = s.charAt(i) - 'a';
      if (x < 0 || x > 2) throw new IllegalArgumentException();
      last[x] = i;
      count += 1 + Math.min(last[0], Math.min(last[1], last[2]));
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve("abcabc"));
  }
}
