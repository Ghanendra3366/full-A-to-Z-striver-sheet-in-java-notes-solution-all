import java.util.*;

public class Solution {
  static class Node {
    int value;
    Node left, right;

    Node(int v) {
      value = v;
    }
  }

  static Node sample() {
    Node r = new Node(4);
    r.left = new Node(2);
    r.right = new Node(6);
    r.left.left = new Node(1);
    r.left.right = new Node(3);
    r.right.left = new Node(5);
    r.right.right = new Node(7);
    return r;
  }

  static void inorder(Node r, List<Integer> out) {
    if (r != null) {
      inorder(r.left, out);
      out.add(r.value);
      inorder(r.right, out);
    }
  }

  static String view(Node r) {
    List<Integer> a = new ArrayList<>();
    inorder(r, a);
    return a.toString();
  }

  static class BSTIterator {
    final Deque<Node> stack = new ArrayDeque<>();
    final boolean reverse;

    BSTIterator(Node root, boolean reverse) {
      this.reverse = reverse;
      push(root);
    }

    void push(Node r) {
      while (r != null) {
        stack.push(r);
        r = reverse ? r.right : r.left;
      }
    }

    boolean hasNext() {
      return !stack.isEmpty();
    }

    Node nextNode() {
      Node r = stack.pop();
      push(reverse ? r.left : r.right);
      return r;
    }

    int next() {
      return nextNode().value;
    }
  }

  public static void main(String[] args) {
    BSTIterator it = new BSTIterator(sample(), false);
    List<Integer> a = new ArrayList<>();
    while (it.hasNext()) a.add(it.next());
    System.out.println(a);
  }
}
