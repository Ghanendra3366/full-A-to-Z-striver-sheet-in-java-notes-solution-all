import java.util.*;

public class Solution {
  static void insert(Deque<Integer> s, int x) {
    if (s.isEmpty() || s.peek() <= x) {
      s.push(x);
      return;
    }
    int y = s.pop();
    insert(s, x);
    s.push(y);
  }

  public static void solve(Deque<Integer> s) {
    if (s.isEmpty()) return;
    int x = s.pop();
    solve(s);
    insert(s, x);
  }

  public static void main(String[] args) {
    Deque<Integer> s = new ArrayDeque<>(Arrays.asList(4, 1, 3, 2));
    solve(s);
    System.out.println(s);
  }
}
