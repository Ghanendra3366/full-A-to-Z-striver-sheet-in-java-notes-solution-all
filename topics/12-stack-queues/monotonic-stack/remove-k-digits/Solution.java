import java.util.*;

public class Solution {
  public static String solve(String s, int k) {
    if (k < 0 || k > s.length()) throw new IllegalArgumentException();
    StringBuilder stack = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (c < '0' || c > '9') throw new IllegalArgumentException();
      while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > c) {
        stack.setLength(stack.length() - 1);
        k--;
      }
      stack.append(c);
    }
    stack.setLength(stack.length() - k);
    int first = 0;
    while (first < stack.length() && stack.charAt(first) == '0') first++;
    return first == stack.length() ? "0" : stack.substring(first);
  }

  public static void main(String[] args) {
    System.out.println(solve("1432219", 3));
  }
}
