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

  public static List<Integer> solve(Node a, Node b) {
    List<Integer> x = new ArrayList<>(), y = new ArrayList<>(), out = new ArrayList<>();
    inorder(a, x);
    inorder(b, y);
    int i = 0, j = 0;
    while (i < x.size() || j < y.size())
      out.add(j == y.size() || (i < x.size() && x.get(i) <= y.get(j)) ? x.get(i++) : y.get(j++));
    return out;
  }

  public static void main(String[] args) {
    Node a = new Node(2);
    a.left = new Node(1);
    Node b = new Node(3);
    System.out.println(solve(a, b));
  }
}
