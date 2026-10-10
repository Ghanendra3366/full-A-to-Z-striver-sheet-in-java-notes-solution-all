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

  private static void dfs(Node r, List<Integer> p, List<List<Integer>> out) {
    if (r == null) return;
    p.add(r.value);
    if (r.left == null && r.right == null) out.add(new ArrayList<>(p));
    else {
      dfs(r.left, p, out);
      dfs(r.right, p, out);
    }
    p.remove(p.size() - 1);
  }

  public static List<List<Integer>> solve(Node r) {
    List<List<Integer>> out = new ArrayList<>();
    dfs(r, new ArrayList<>(), out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(sample()));
  }
}
