import java.util.*;

public class Solution {
  static class Node {
    int value;
    Node next, prev, random, bottom;

    Node(int v) {
      value = v;
    }
  }

  static Node list(int... values) {
    Node dummy = new Node(0), tail = dummy;
    for (int v : values) {
      tail.next = new Node(v);
      tail.next.prev = tail == dummy ? null : tail;
      tail = tail.next;
    }
    return dummy.next;
  }

  static String view(Node head) {
    List<Integer> a = new ArrayList<>();
    for (Node n = head; n != null; n = n.next) a.add(n.value);
    return a.toString();
  }

  public static List<List<Integer>> solve(Node h, long target) {
    List<List<Integer>> out = new ArrayList<>();
    if (h == null) return out;
    Node l = h, r = h;
    int lo = 0, hi = 0;
    while (r.next != null) {
      r = r.next;
      hi++;
    }
    while (lo < hi) {
      long sum = (long) l.value + r.value;
      if (sum < target) {
        l = l.next;
        lo++;
      } else if (sum > target) {
        r = r.prev;
        hi--;
      } else {
        out.add(Arrays.asList(l.value, r.value));
        int a = l.value, b = r.value;
        do {
          l = l.next;
          lo++;
        } while (lo <= hi && l.value == a);
        do {
          r = r.prev;
          hi--;
        } while (hi >= lo && r.value == b);
      }
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(list(1, 2, 3, 4, 5), 6));
  }
}
