import java.util.*;

public class Solution {
  static class Node {
    Node[] child = new Node[26];
  }

  public static long solve(String s) {
    for (char c : s.toCharArray()) if (c < 'a' || c > 'z') throw new IllegalArgumentException();
    Node root = new Node();
    long count = 1;
    for (int start = 0; start < s.length(); start++) {
      Node p = root;
      for (int end = start; end < s.length(); end++) {
        int x = s.charAt(end) - 'a';
        if (p.child[x] == null) {
          p.child[x] = new Node();
          count++;
        }
        p = p.child[x];
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve("ababa"));
  }
}
