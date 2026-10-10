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

  static boolean leaf(Node r) {
    return r != null && r.left == null && r.right == null;
  }

  static void leaves(Node r, List<Integer> a) {
    if (r == null) return;
    if (leaf(r)) {
      a.add(r.value);
      return;
    }
    leaves(r.left, a);
    leaves(r.right, a);
  }

  public static List<Integer> solve(Node r) {
    List<Integer> out = new ArrayList<>();
    if (r == null) return out;
    if (!leaf(r)) out.add(r.value);
    for (Node p = r.left; p != null; p = p.left != null ? p.left : p.right)
      if (!leaf(p)) out.add(p.value);
    leaves(r, out);
    List<Integer> right = new ArrayList<>();
    for (Node p = r.right; p != null; p = p.right != null ? p.right : p.left)
      if (!leaf(p)) right.add(p.value);
    Collections.reverse(right);
    out.addAll(right);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(sample()));
  }
}
