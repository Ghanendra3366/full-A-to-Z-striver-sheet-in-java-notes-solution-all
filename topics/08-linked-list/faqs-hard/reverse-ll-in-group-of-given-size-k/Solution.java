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

  public static Node solve(Node h, int k) {
    if (k <= 0) throw new IllegalArgumentException();
    Node dummy = new Node(0);
    dummy.next = h;
    Node before = dummy;
    while (true) {
      Node end = before;
      for (int i = 0; i < k && end != null; i++) end = end.next;
      if (end == null) break;
      Node after = end.next, old = before.next, p = old, previous = after;
      while (p != after) {
        Node next = p.next;
        p.next = previous;
        previous = p;
        p = next;
      }
      before.next = end;
      before = old;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(list(1, 2, 3, 4, 5), 2)));
  }
}
