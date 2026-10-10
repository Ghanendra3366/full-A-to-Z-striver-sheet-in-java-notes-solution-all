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

  public static Node solve(Node h, int k, int value) {
    if (k < 1) throw new IllegalArgumentException();
    Node p = h;
    for (int i = 1; i < k && p != null; i++) p = p.next;
    if (p == null) throw new IllegalArgumentException();
    Node n = new Node(value);
    n.prev = p.prev;
    n.next = p;
    if (p.prev != null) p.prev.next = n;
    else h = n;
    p.prev = n;
    return h;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(list(1, 3), 2, 2)));
  }
}
