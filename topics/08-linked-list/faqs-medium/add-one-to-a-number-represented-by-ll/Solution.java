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

  public static Node solve(Node h) {
    Node sentinel = new Node(0);
    sentinel.next = h;
    Node lastNotNine = sentinel;
    for (Node p = h; p != null; p = p.next) {
      if (p.value < 0 || p.value > 9) throw new IllegalArgumentException();
      if (p.value != 9) lastNotNine = p;
    }
    lastNotNine.value++;
    for (Node p = lastNotNine.next; p != null; p = p.next) p.value = 0;
    return sentinel.value == 0 ? sentinel.next : sentinel;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(list(1, 2, 9))));
  }
}
