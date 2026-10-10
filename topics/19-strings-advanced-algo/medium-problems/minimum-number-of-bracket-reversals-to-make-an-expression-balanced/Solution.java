import java.util.*;

public class Solution {
  public static int solve(String s) {
    if (s.length() % 2 == 1) return -1;
    int open = 0, close = 0;
    for (char c : s.toCharArray()) {
      if (c == '{') open++;
      else if (c == '}') {
        if (open > 0) open--;
        else close++;
      } else throw new IllegalArgumentException();
    }
    return (open + 1) / 2 + (close + 1) / 2;
  }

  public static void main(String[] args) {
    System.out.println(solve("}{{}}{{{"));
  }
}
