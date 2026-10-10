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

  static int height(Node r) {
    return r == null ? 0 : 1 + Math.max(height(r.left), height(r.right));
  }

  static boolean mirror(Node a, Node b) {
    if (a == null || b == null) return a == b;
    return a.value == b.value && mirror(a.left, b.right) && mirror(a.right, b.left);
  }

  public static boolean solve(Node r) {
    if (r == null || r.left == null && r.right == null) return true;
    long sum = (r.left == null ? 0L : r.left.value) + (r.right == null ? 0L : r.right.value);
    return r.value == sum && solve(r.left) && solve(r.right);
  }

  public static void main(String[] args) {
    System.out.println(solve(sample()));
  }
}
