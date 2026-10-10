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

  public static Node solve(Node h, int n) {
    if (n <= 0) throw new IllegalArgumentException();
    Node dummy = new Node(0);
    dummy.next = h;
    Node fast = dummy, slow = dummy;
    for (int i = 0; i < n; i++) {
      fast = fast.next;
      if (fast == null) throw new IllegalArgumentException("n exceeds length");
    }
    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(list(1, 2, 3, 4), 2)));
  }
}
