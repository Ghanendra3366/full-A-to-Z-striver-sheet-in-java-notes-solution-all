import java.util.*;

public class Solution {
  public static int solve(String s) {
    int depth = 0, best = 0;
    for (char c : s.toCharArray()) {
      if (c == '(') best = Math.max(best, ++depth);
      else if (c == ')') depth--;
      if (depth < 0) throw new IllegalArgumentException();
    }
    if (depth != 0) throw new IllegalArgumentException();
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve("(1+(2*3)+((8)/4))+1"));
  }
}
