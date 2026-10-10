import java.util.*;

public class Solution {
  static class Node {
    int value;
    Node next;

    Node(int x) {
      value = x;
    }
  }

  static class StackDS {
    Node head;

    void push(int x) {
      Node n = new Node(x);
      n.next = head;
      head = n;
    }

    int pop() {
      if (head == null) throw new NoSuchElementException();
      int x = head.value;
      head = head.next;
      return x;
    }
  }

  public static void main(String[] args) {
    StackDS s = new StackDS();
    s.push(1);
    s.push(2);
    System.out.println(s.pop());
  }
}
