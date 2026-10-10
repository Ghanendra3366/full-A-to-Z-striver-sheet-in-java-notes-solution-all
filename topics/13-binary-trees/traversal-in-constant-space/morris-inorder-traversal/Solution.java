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

  public static List<Integer> solve(Node r) {
    List<Integer> out = new ArrayList<>();
    while (r != null) {
      if (r.left == null) {
        out.add(r.value);
        r = r.right;
      } else {
        Node before = r.left;
        while (before.right != null && before.right != r) before = before.right;
        if (before.right == null) {
          before.right = r;
          r = r.left;
        } else {
          before.right = null;
          out.add(r.value);
          r = r.right;
        }
      }
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(sample()));
  }
}
