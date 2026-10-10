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

  private static Node build(int[] a, int[] at, long low, long high) {
    if (at[0] == a.length || a[at[0]] <= low || a[at[0]] >= high) return null;
    Node r = new Node(a[at[0]++]);
    r.left = build(a, at, low, r.value);
    r.right = build(a, at, r.value, high);
    return r;
  }

  public static Node solve(int[] a) {
    int[] at = {0};
    Node r = build(a, at, Long.MIN_VALUE, Long.MAX_VALUE);
    if (at[0] != a.length) throw new IllegalArgumentException("invalid strict BST preorder");
    return r;
  }

  public static void main(String[] args) {
    System.out.println(view(solve(new int[] {4, 2, 1, 3, 6, 5, 7})));
  }
}
