import java.util.*;

public class Solution {
  static class Heap {
    final List<Integer> a = new ArrayList<>();
    final boolean min;

    Heap(boolean min) {
      this.min = min;
    }

    boolean better(int x, int y) {
      return min ? x < y : x > y;
    }

    void swap(int i, int j) {
      int t = a.get(i);
      a.set(i, a.get(j));
      a.set(j, t);
    }

    void offer(int x) {
      a.add(x);
      for (int i = a.size() - 1; i > 0; ) {
        int p = (i - 1) / 2;
        if (!better(a.get(i), a.get(p))) break;
        swap(i, p);
        i = p;
      }
    }

    int peek() {
      if (a.isEmpty()) throw new NoSuchElementException();
      return a.get(0);
    }

    int poll() {
      int ans = peek(), last = a.remove(a.size() - 1);
      if (!a.isEmpty()) {
        a.set(0, last);
        for (int i = 0; ; ) {
          int best = i, l = 2 * i + 1, r = l + 1;
          if (l < a.size() && better(a.get(l), a.get(best))) best = l;
          if (r < a.size() && better(a.get(r), a.get(best))) best = r;
          if (best == i) break;
          swap(i, best);
          i = best;
        }
      }
      return ans;
    }

    boolean isEmpty() {
      return a.isEmpty();
    }
  }

  public static void main(String[] args) {
    Heap h = new Heap(true);
    h.offer(3);
    h.offer(1);
    h.offer(2);
    List<Integer> a = new ArrayList<>();
    while (!h.isEmpty()) a.add(h.poll());
    System.out.println(a);
  }
}
