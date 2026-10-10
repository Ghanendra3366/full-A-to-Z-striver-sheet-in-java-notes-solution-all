import java.util.*;

public class Solution {
  static boolean operand(char c) {
    return Character.isLetterOrDigit(c);
  }

  static int priority(char c) {
    if (c == '^') return 3;
    if (c == '*' || c == '/') return 2;
    if (c == '+' || c == '-') return 1;
    throw new IllegalArgumentException();
  }

  static String postfix(String infix) {
    StringBuilder out = new StringBuilder();
    Deque<Character> ops = new ArrayDeque<>();
    for (char c : infix.toCharArray()) {
      if (Character.isWhitespace(c)) continue;
      if (operand(c)) out.append(c);
      else if (c == '(') ops.push(c);
      else if (c == ')') {
        while (!ops.isEmpty() && ops.peek() != '(') out.append(ops.pop());
        if (ops.isEmpty()) throw new IllegalArgumentException();
        ops.pop();
      } else {
        int p = priority(c);
        while (!ops.isEmpty()
            && ops.peek() != '('
            && (priority(ops.peek()) > p || priority(ops.peek()) == p && c != '^'))
          out.append(ops.pop());
        ops.push(c);
      }
    }
    while (!ops.isEmpty()) {
      if (ops.peek() == '(') throw new IllegalArgumentException();
      out.append(ops.pop());
    }
    return out.toString();
  }

  static String convert(String s, boolean prefixInput, boolean infixOutput, boolean prefixOutput) {
    Deque<String> stack = new ArrayDeque<>();
    int n = s.length();
    for (int step = 0; step < n; step++) {
      char c = s.charAt(prefixInput ? n - 1 - step : step);
      if (Character.isWhitespace(c)) continue;
      if (operand(c)) stack.push(String.valueOf(c));
      else {
        priority(c);
        if (stack.size() < 2) throw new IllegalArgumentException();
        String first = stack.pop(),
            second = stack.pop(),
            left = prefixInput ? first : second,
            right = prefixInput ? second : first;
        stack.push(
            infixOutput
                ? "(" + left + c + right + ")"
                : prefixOutput ? c + left + right : left + right + c);
      }
    }
    if (stack.size() != 1) throw new IllegalArgumentException();
    return stack.pop();
  }

  public static String solve(String s) {
    return convert(s, false, false, true);
  }

  public static void main(String[] args) {
    System.out.println(solve("abc*+"));
  }
}
