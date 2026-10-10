import java.util.*;

public class Solution {
  static class QueueDS {
    final Deque<Integer> in = new ArrayDeque<>(), out = new ArrayDeque<>();

    void offer(int x) {
      in.push(x);
    }

    int poll() {
      if (out.isEmpty()) while (!in.isEmpty()) out.push(in.pop());
      if (out.isEmpty()) throw new NoSuchElementException();
      return out.pop();
    }
  }

  public static void main(String[] args) {
    QueueDS q = new QueueDS();
    q.offer(1);
    q.offer(2);
    System.out.println(q.poll());
  }
}
