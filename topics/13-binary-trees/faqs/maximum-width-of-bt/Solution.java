import java.math.BigInteger;
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

  static class Indexed {
    Node n;
    BigInteger i;

    Indexed(Node n, BigInteger i) {
      this.n = n;
      this.i = i;
    }
  }

  public static BigInteger solve(Node r) {
    if (r == null) return BigInteger.ZERO;
    Queue<Indexed> q = new ArrayDeque<>();
    q.offer(new Indexed(r, BigInteger.ZERO));
    BigInteger best = BigInteger.ONE;
    while (!q.isEmpty()) {
      int size = q.size();
      BigInteger base = q.peek().i, last = BigInteger.ZERO;
      for (int j = 0; j < size; j++) {
        Indexed p = q.poll();
        BigInteger i = p.i.subtract(base);
        last = i;
        if (p.n.left != null) q.offer(new Indexed(p.n.left, i.shiftLeft(1)));
        if (p.n.right != null) q.offer(new Indexed(p.n.right, i.shiftLeft(1).add(BigInteger.ONE)));
      }
      best = best.max(last.add(BigInteger.ONE));
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(sample()));
  }
}
