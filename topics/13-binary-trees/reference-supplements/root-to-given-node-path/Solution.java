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

  static boolean find(Node r, Node target, List<Integer> path) {
    if (r == null) return false;
    path.add(r.value);
    if (r == target || find(r.left, target, path) || find(r.right, target, path)) return true;
    path.remove(path.size() - 1);
    return false;
  }

  public static List<Integer> solve(Node r, Node target) {
    List<Integer> out = new ArrayList<>();
    find(r, target, out);
    return out;
  }

  public static void main(String[] args) {
    Node r = sample();
    System.out.println(solve(r, r.right.left));
  }
}
