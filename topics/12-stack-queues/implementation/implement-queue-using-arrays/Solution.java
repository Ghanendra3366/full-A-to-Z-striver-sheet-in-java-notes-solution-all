import java.util.*;

public class Solution {
  static class QueueDS {
    final int[] a;
    int head, tail, size;

    QueueDS(int capacity) {
      if (capacity < 1) throw new IllegalArgumentException();
      a = new int[capacity];
    }

    void offer(int x) {
      if (size == a.length) throw new IllegalStateException("full");
      a[tail] = x;
      tail = (tail + 1) % a.length;
      size++;
    }

    int poll() {
      if (size == 0) throw new NoSuchElementException();
      int x = a[head];
      head = (head + 1) % a.length;
      size--;
      return x;
    }
  }

  public static void main(String[] args) {
    QueueDS q = new QueueDS(3);
    q.offer(1);
    q.offer(2);
    System.out.println(q.poll());
  }
}
