import java.util.*;

public class Solution {
  static class BitNode {
    BitNode[] child = new BitNode[2];
  }

  static void insert(BitNode root, int x) {
    if (x < 0) throw new IllegalArgumentException();
    BitNode p = root;
    for (int bit = 30; bit >= 0; bit--) {
      int b = (x >>> bit) & 1;
      if (p.child[b] == null) p.child[b] = new BitNode();
      p = p.child[b];
    }
  }

  static int query(BitNode root, int x) {
    if (x < 0) throw new IllegalArgumentException();
    int ans = 0;
    BitNode p = root;
    for (int bit = 30; bit >= 0; bit--) {
      int b = (x >>> bit) & 1;
      if (p.child[1 - b] != null) {
        ans |= 1 << bit;
        p = p.child[1 - b];
      } else p = p.child[b];
    }
    return ans;
  }

  public static int solve(int[] a) {
    if (a.length < 2) return 0;
    BitNode root = new BitNode();
    insert(root, a[0]);
    int best = 0;
    for (int i = 1; i < a.length; i++) {
      best = Math.max(best, query(root, a[i]));
      insert(root, a[i]);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {3, 10, 5, 25, 2, 8}));
  }
}
