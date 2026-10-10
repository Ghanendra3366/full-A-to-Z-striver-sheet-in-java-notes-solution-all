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
    Node dummy = new Node(0), tail = dummy;
    int carry = 0;
    while (a != null || b != null || carry != 0) {
      int sum = carry;
      if (a != null) {
        if (a.value < 0 || a.value > 9) throw new IllegalArgumentException();
        sum += a.value;
        a = a.next;
      }
      if (b != null) {
        if (b.value < 0 || b.value > 9) throw new IllegalArgumentException();
        sum += b.value;
        b = b.next;
      }
      tail.next = new Node(sum % 10);
      tail = tail.next;
      carry = sum / 10;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(list(2, 4, 3), list(5, 6, 4))));
  }
}
