import java.util.*;

public class Solution {
  static class MedianFinder {
    final PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder()),
        high = new PriorityQueue<>();

    void add(int x) {
      if (low.isEmpty() || x <= low.peek()) low.offer(x);
      else high.offer(x);
      if (low.size() > high.size() + 1) high.offer(low.poll());
      if (high.size() > low.size()) low.offer(high.poll());
    }

    double median() {
      if (low.isEmpty()) throw new NoSuchElementException();
      return low.size() > high.size() ? low.peek() : ((long) low.peek() + high.peek()) / 2.0;
    }
  }

  public static void main(String[] args) {
    MedianFinder m = new MedianFinder();
    m.add(1);
    m.add(2);
    System.out.println(m.median());
    m.add(3);
    System.out.println(m.median());
  }
}
