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

  public static int[] solve(Node r) {
    if (r == null) throw new IllegalArgumentException();
    Node lo = r, hi = r;
    while (lo.left != null) lo = lo.left;
    while (hi.right != null) hi = hi.right;
    return new int[] {lo.value, hi.value};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(sample())));
  }
}
