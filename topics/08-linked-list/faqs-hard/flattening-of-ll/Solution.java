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

  private static Node mergeBottom(Node a, Node b) {
    Node dummy = new Node(0), tail = dummy;
    while (a != null && b != null) {
      if (a.value <= b.value) {
        tail.bottom = a;
        a = a.bottom;
      } else {
        tail.bottom = b;
        b = b.bottom;
      }
      tail = tail.bottom;
      tail.next = null;
    }
    tail.bottom = a != null ? a : b;
    for (Node p = tail.bottom; p != null; p = p.bottom) p.next = null;
    return dummy.bottom;
  }

  public static Node solve(Node h) {
    if (h == null || h.next == null) return h;
    Node right = solve(h.next);
    h.next = null;
    return mergeBottom(h, right);
  }

  public static void main(String[] args) {
    Node a = new Node(1), b = new Node(2);
    a.bottom = new Node(3);
    b.bottom = new Node(4);
    a.next = b;
    Node flat = solve(a);
    List<Integer> out = new ArrayList<>();
    for (Node p = flat; p != null; p = p.bottom) out.add(p.value);
    System.out.println(out);
  }
}
