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

  public static Node solve(Node r, int x) {
    if (r == null) return null;
    if (x < r.value) r.left = solve(r.left, x);
    else if (x > r.value) r.right = solve(r.right, x);
    else {
      if (r.left == null) return r.right;
      if (r.right == null) return r.left;
      Node successor = r.right;
      while (successor.left != null) successor = successor.left;
      r.value = successor.value;
      r.right = solve(r.right, successor.value);
    }
    return r;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(sample(), 4)));
  }
}
