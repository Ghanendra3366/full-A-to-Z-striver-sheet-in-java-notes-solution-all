import java.util.*;

public class Solution {
  static class KthLargest {
    final int k;
    final PriorityQueue<Integer> q = new PriorityQueue<>();

    KthLargest(int k) {
      if (k < 1) throw new IllegalArgumentException();
      this.k = k;
    }

    OptionalInt add(int x) {
      q.offer(x);
      if (q.size() > k) q.poll();
      return q.size() < k ? OptionalInt.empty() : OptionalInt.of(q.peek());
    }
  }

  public static void main(String[] args) {
    KthLargest stream = new KthLargest(2);
    stream.add(3);
    stream.add(5);
    System.out.println(stream.add(4).getAsInt());
  }
}
