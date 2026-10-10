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

  static void encode(Node r, StringBuilder s) {
    if (r == null) {
      s.append("#, ");
      return;
    }
    s.append(r.value).append(", ");
    encode(r.left, s);
    encode(r.right, s);
  }

  public static String serialize(Node r) {
    StringBuilder s = new StringBuilder();
    encode(r, s);
    return s.toString();
  }

  static Node decode(String[] tokens, int[] at) {
    if (at[0] >= tokens.length) throw new IllegalArgumentException();
    String t = tokens[at[0]++].trim();
    if (t.equals("#")) return null;
    Node r = new Node(Integer.parseInt(t));
    r.left = decode(tokens, at);
    r.right = decode(tokens, at);
    return r;
  }

  public static Node deserialize(String s) {
    String[] tokens = s.trim().split(",");
    int[] at = {0};
    Node r = decode(tokens, at);
    if (at[0] != tokens.length) throw new IllegalArgumentException();
    return r;
  }

  public static void main(String[] args) {
    Node r = sample();
    System.out.println(view(deserialize(serialize(r))));
  }
}
