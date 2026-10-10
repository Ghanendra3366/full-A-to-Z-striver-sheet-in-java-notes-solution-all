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

  static class Position {
    Node n;
    int col, row;

    Position(Node n, int c, int r) {
      this.n = n;
      col = c;
      row = r;
    }
  }

  static List<Position> positions(Node root) {
    List<Position> out = new ArrayList<>();
    if (root == null) return out;
    Queue<Position> q = new ArrayDeque<>();
    q.offer(new Position(root, 0, 0));
    while (!q.isEmpty()) {
      Position p = q.poll();
      out.add(p);
      if (p.n.left != null) q.offer(new Position(p.n.left, p.col - 1, p.row + 1));
      if (p.n.right != null) q.offer(new Position(p.n.right, p.col + 1, p.row + 1));
    }
    return out;
  }

  public static List<List<Integer>> solve(Node r) {
    List<Position> all = positions(r);
    all.sort(
        (a, b) -> {
          int c = Integer.compare(a.col, b.col);
          if (c == 0) c = Integer.compare(a.row, b.row);
          if (c == 0) c = Integer.compare(a.n.value, b.n.value);
          return c;
        });
    List<List<Integer>> out = new ArrayList<>();
    Integer col = null;
    for (Position p : all) {
      if (col == null || p.col != col) {
        out.add(new ArrayList<>());
        col = p.col;
      }
      out.get(out.size() - 1).add(p.n.value);
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(sample()));
  }
}
