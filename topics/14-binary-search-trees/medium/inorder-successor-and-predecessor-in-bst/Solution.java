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

  public static OptionalInt[] solve(Node r, int x) {
    Integer before = null, after = null;
    Node p = r;
    while (p != null) {
      if (p.value < x) {
        before = p.value;
        p = p.right;
      } else p = p.left;
    }
    p = r;
    while (p != null) {
      if (p.value > x) {
        after = p.value;
        p = p.left;
      } else p = p.right;
    }
    return new OptionalInt[] {
      before == null ? OptionalInt.empty() : OptionalInt.of(before),
      after == null ? OptionalInt.empty() : OptionalInt.of(after)
    };
  }

  public static void main(String[] args) {
    OptionalInt[] a = solve(sample(), 4);
    System.out.println(a[0].getAsInt() + " " + a[1].getAsInt());
  }
}
