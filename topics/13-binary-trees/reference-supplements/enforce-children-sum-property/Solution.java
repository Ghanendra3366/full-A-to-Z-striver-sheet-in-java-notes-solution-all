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

  static void check(Node r) {
    if (r == null) return;
    if (r.value < 0) throw new IllegalArgumentException("nonnegative values required");
    check(r.left);
    check(r.right);
  }

  static void enforce(Node r) {
    if (r == null || r.left == null && r.right == null) return;
    int sum = Math.addExact(r.left == null ? 0 : r.left.value, r.right == null ? 0 : r.right.value);
    if (sum >= r.value) r.value = sum;
    else if (r.left != null) r.left.value = r.value;
    else r.right.value = r.value;
    enforce(r.left);
    enforce(r.right);
    r.value = Math.addExact(r.left == null ? 0 : r.left.value, r.right == null ? 0 : r.right.value);
  }

  public static void solve(Node r) {
    check(r);
    enforce(r);
  }

  public static void main(String[] args) {
    Node r = sample();
    solve(r);
    System.out.println(r.value + " " + r.left.value + " " + r.right.value);
  }
}
