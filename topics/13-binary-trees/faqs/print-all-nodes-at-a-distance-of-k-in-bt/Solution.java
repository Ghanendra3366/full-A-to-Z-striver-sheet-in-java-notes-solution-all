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

  static Map<Node, Node> parents(Node root) {
    Map<Node, Node> parent = new IdentityHashMap<>();
    if (root == null) return parent;
    Queue<Node> q = new ArrayDeque<>();
    q.offer(root);
    parent.put(root, null);
    while (!q.isEmpty()) {
      Node p = q.poll();
      if (p.left != null) {
        parent.put(p.left, p);
        q.offer(p.left);
      }
      if (p.right != null) {
        parent.put(p.right, p);
        q.offer(p.right);
      }
    }
    return parent;
  }

  static List<List<Node>> outward(Node root, Node target) {
    Map<Node, Node> parent = parents(root);
    if (!parent.containsKey(target)) throw new IllegalArgumentException("target not in tree");
    Set<Node> seen = Collections.newSetFromMap(new IdentityHashMap<Node, Boolean>());
    Queue<Node> q = new ArrayDeque<>();
    q.offer(target);
    seen.add(target);
    List<List<Node>> out = new ArrayList<>();
    while (!q.isEmpty()) {
      List<Node> row = new ArrayList<>();
      for (int size = q.size(); size > 0; size--) {
        Node p = q.poll();
        row.add(p);
        for (Node next : new Node[] {p.left, p.right, parent.get(p)})
          if (next != null && seen.add(next)) q.offer(next);
      }
      out.add(row);
    }
    return out;
  }

  public static List<Integer> solve(Node root, Node target, int k) {
    if (k < 0) throw new IllegalArgumentException();
    List<List<Node>> layers = outward(root, target);
    List<Integer> out = new ArrayList<>();
    if (k < layers.size()) for (Node n : layers.get(k)) out.add(n.value);
    return out;
  }

  public static void main(String[] args) {
    Node r = sample();
    System.out.println(solve(r, r.left, 2));
  }
}
