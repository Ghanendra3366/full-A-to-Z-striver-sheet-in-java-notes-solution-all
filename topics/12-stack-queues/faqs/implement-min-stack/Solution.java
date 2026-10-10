import java.util.*;

public class Solution {
  static class MinStack {
    final Deque<Integer> values = new ArrayDeque<>(), mins = new ArrayDeque<>();

    void push(int x) {
      values.push(x);
      mins.push(mins.isEmpty() ? x : Math.min(x, mins.peek()));
    }

    int pop() {
      if (values.isEmpty()) throw new NoSuchElementException();
      mins.pop();
      return values.pop();
    }

    int min() {
      return mins.element();
    }
  }

  public static void main(String[] args) {
    MinStack s = new MinStack();
    s.push(3);
    s.push(1);
    s.push(2);
    System.out.println(s.min());
    s.pop();
    s.pop();
    System.out.println(s.min());
  }
}
