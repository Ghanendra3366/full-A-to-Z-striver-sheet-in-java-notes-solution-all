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

  public static Node solve(Node[] heads) {
    PriorityQueue<Node> q = new PriorityQueue<>((a, b) -> Integer.compare(a.value, b.value));
    for (Node h : heads) if (h != null) q.offer(h);
    Node dummy = new Node(0), tail = dummy;
    while (!q.isEmpty()) {
      Node p = q.poll(), next = p.next;
      tail.next = p;
      tail = p;
      if (next != null) q.offer(next);
    }
    if (tail != dummy) tail.next = null;
    return dummy.next;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(new Node[] {list(1, 4), list(2, 5), list(3, 6)})));
  }
}
