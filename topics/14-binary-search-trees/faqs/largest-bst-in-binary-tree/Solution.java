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

  private static long[] info(Node r) {
    if (r == null) return new long[] {1, 0, Long.MAX_VALUE, Long.MIN_VALUE, 0};
    long[] l = info(r.left), q = info(r.right);
    if (l[0] == 1 && q[0] == 1 && l[3] < r.value && r.value < q[2]) {
      long size = 1 + l[1] + q[1];
      return new long[] {1, size, Math.min(l[2], r.value), Math.max(q[3], r.value), size};
    }
    return new long[] {0, 0, 0, 0, Math.max(l[4], q[4])};
  }

  public static long solve(Node r) {
    return info(r)[4];
  }

  public static void main(String[] args) {
    System.out.println(solve(sample()));
  }
}
