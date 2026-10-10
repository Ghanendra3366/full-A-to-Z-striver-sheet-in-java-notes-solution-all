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

  private static Node build(
      int[] order, int ol, int or, int il, int ir, Map<Integer, Integer> index, boolean pre) {
    if (ol >= or) return null;
    int value = order[pre ? ol : or - 1];
    Integer split = index.get(value);
    if (split == null || split < il || split >= ir)
      throw new IllegalArgumentException("inconsistent traversals");
    int size = split - il;
    Node r = new Node(value);
    if (pre) {
      r.left = build(order, ol + 1, ol + 1 + size, il, split, index, true);
      r.right = build(order, ol + 1 + size, or, split + 1, ir, index, true);
    } else {
      r.left = build(order, ol, ol + size, il, split, index, false);
      r.right = build(order, ol + size, or - 1, split + 1, ir, index, false);
    }
    return r;
  }

  public static Node solve(int[] order, int[] in) {
    if (order.length != in.length) throw new IllegalArgumentException();
    Map<Integer, Integer> index = new HashMap<>();
    for (int i = 0; i < in.length; i++)
      if (index.put(in[i], i) != null) throw new IllegalArgumentException("duplicate labels");
    return build(order, 0, order.length, 0, in.length, index, true);
  }

  public static void main(String[] args) {
    System.out.println(view(solve(new int[] {2, 1, 3}, new int[] {1, 2, 3})));
  }
}
