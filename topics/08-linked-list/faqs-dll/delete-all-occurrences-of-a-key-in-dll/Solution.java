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

  public static Node solve(Node h, int key) {
    Node p = h;
    while (p != null) {
      Node next = p.next;
      if (p.value == key) {
        if (p.prev != null) p.prev.next = next;
        else h = next;
        if (next != null) next.prev = p.prev;
        p.next = p.prev = null;
      }
      p = next;
    }
    return h;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(list(1, 2, 2, 3), 2)));
  }
}
