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

  private static long gain(Node r, long[] best) {
    if (r == null) return 0;
    long l = Math.max(0, gain(r.left, best)), q = Math.max(0, gain(r.right, best));
    best[0] = Math.max(best[0], r.value + l + q);
    return r.value + Math.max(l, q);
  }

  public static long solve(Node r) {
    if (r == null) throw new IllegalArgumentException();
    long[] best = {Long.MIN_VALUE};
    gain(r, best);
    return best[0];
  }

  public static void main(String[] args) {
    System.out.println(solve(sample()));
  }
}
