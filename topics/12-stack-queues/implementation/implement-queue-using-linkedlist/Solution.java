import java.util.*;

public class Solution {
  static class Node {
    int value;
    Node next;

    Node(int x) {
      value = x;
    }
  }

  static class QueueDS {
    Node head, tail;

    void offer(int x) {
      Node n = new Node(x);
      if (tail == null) head = n;
      else tail.next = n;
      tail = n;
    }

    int poll() {
      if (head == null) throw new NoSuchElementException();
      int x = head.value;
      head = head.next;
      if (head == null) tail = null;
      return x;
    }
  }

  public static void main(String[] args) {
    QueueDS q = new QueueDS();
    q.offer(1);
    q.offer(2);
    System.out.println(q.poll());
  }
}
