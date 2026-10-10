import java.util.*;

public class Solution {
  public static boolean solve(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') stack.push(c);
      else if (c == ')' || c == ']' || c == '}') {
        if (stack.isEmpty()) return false;
        char open = stack.pop();
        if (c == ')' && open != '(' || c == ']' && open != '[' || c == '}' && open != '{')
          return false;
      } else throw new IllegalArgumentException();
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(solve("{[()]}"));
  }
}
