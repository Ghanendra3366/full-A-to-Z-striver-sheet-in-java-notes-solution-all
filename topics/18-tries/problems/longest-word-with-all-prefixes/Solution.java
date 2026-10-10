import java.util.*;

public class Solution {
  static class Node {
    Node[] child = new Node[26];
    int pass, end;
  }

  static class Trie {
    final Node root = new Node();

    private int index(char c) {
      if (c < 'a' || c > 'z') throw new IllegalArgumentException("lowercase only");
      return c - 'a';
    }

    void insert(String word) {
      for (char c : word.toCharArray()) index(c);
      Node p = root;
      p.pass++;
      for (char c : word.toCharArray()) {
        int i = index(c);
        if (p.child[i] == null) p.child[i] = new Node();
        p = p.child[i];
        p.pass++;
      }
      p.end++;
    }

    Node walk(String s) {
      Node p = root;
      for (char c : s.toCharArray()) {
        p = p.child[index(c)];
        if (p == null) return null;
      }
      return p;
    }

    boolean search(String word) {
      Node p = walk(word);
      return p != null && p.end > 0;
    }

    boolean startsWith(String prefix) {
      Node p = walk(prefix);
      return p != null && p.pass > 0;
    }

    int countWordsEqualTo(String word) {
      Node p = walk(word);
      return p == null ? 0 : p.end;
    }

    int countWordsStartingWith(String prefix) {
      Node p = walk(prefix);
      return p == null ? 0 : p.pass;
    }

    boolean erase(String word) {
      if (!search(word)) return false;
      Node p = root;
      p.pass--;
      for (char c : word.toCharArray()) {
        p = p.child[index(c)];
        p.pass--;
      }
      p.end--;
      return true;
    }
  }

  public static String solve(String[] words) {
    Trie t = new Trie();
    for (String w : words) t.insert(w);
    String best = "";
    for (String w : words) {
      Node p = t.root;
      boolean valid = true;
      for (char c : w.toCharArray()) {
        p = p.child[c - 'a'];
        if (p.end == 0) {
          valid = false;
          break;
        }
      }
      if (valid
          && (w.length() > best.length() || w.length() == best.length() && w.compareTo(best) < 0))
        best = w;
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new String[] {"n", "ni", "nin", "ninj", "ninja", "ninga"}));
  }
}
