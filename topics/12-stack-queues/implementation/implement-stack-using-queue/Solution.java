import java.util.*;

public class Solution {
  static class StackDS {
    final Queue<Integer> q = new ArrayDeque<>();

    void push(int x) {
      q.offer(x);
      for (int size = q.size() - 1; size > 0; size--) q.offer(q.remove());
    }

    int pop() {
      return q.remove();
    }
  }

  public static void main(String[] args) {
    StackDS s = new StackDS();
    s.push(1);
    s.push(2);
    System.out.println(s.pop());
  }
}
