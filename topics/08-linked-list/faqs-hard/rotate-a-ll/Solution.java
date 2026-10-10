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
    if (k < 0) throw new IllegalArgumentException();
    if (h == null || h.next == null) return h;
    int n = 1;
    Node tail = h;
    while (tail.next != null) {
      tail = tail.next;
      n++;
    }
    k %= n;
    if (k == 0) return h;
    tail.next = h;
    Node cut = h;
    for (int i = 1; i < n - k; i++) cut = cut.next;
    Node result = cut.next;
    cut.next = null;
    return result;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(list(1, 2, 3, 4, 5), 2)));
  }
}
