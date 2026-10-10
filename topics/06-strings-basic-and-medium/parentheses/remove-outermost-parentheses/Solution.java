import java.util.*;

public class Solution {
  public static String solve(String s) {
    StringBuilder out = new StringBuilder();
    int depth = 0;
    for (char c : s.toCharArray()) {
      if (c == '(') {
        if (depth++ > 0) out.append(c);
      } else if (c == ')') {
        if (--depth > 0) out.append(c);
      } else throw new IllegalArgumentException();
      if (depth < 0) throw new IllegalArgumentException();
    }
    if (depth != 0) throw new IllegalArgumentException();
    return out.toString();
  }

  public static void main(String[] args) {
    System.out.println(solve("(()())(())"));
  }
}
