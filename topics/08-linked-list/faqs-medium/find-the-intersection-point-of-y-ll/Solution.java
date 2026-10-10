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

  public static Node solve(Node a, Node b) {
    Node p = a, q = b;
    while (p != q) {
      p = p == null ? b : p.next;
      q = q == null ? a : q.next;
    }
    return p;
  }

  public static void main(String[] args) {
    Node shared = list(8, 9), a = list(1), b = list(2, 3);
    a.next = shared;
    b.next.next = shared;
    System.out.println(solve(a, b).value);
  }
}
