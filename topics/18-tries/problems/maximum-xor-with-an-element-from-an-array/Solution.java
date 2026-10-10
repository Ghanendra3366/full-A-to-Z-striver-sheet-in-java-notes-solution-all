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

  public static int[] solve(int[] input, int[][] queries) {
    int[] a = input.clone();
    Arrays.sort(a);
    Integer[] order = new Integer[queries.length];
    for (int i = 0; i < order.length; i++) order[i] = i;
    Arrays.sort(order, (i, j) -> Integer.compare(queries[i][1], queries[j][1]));
    int[] out = new int[queries.length];
    BitNode root = new BitNode();
    int at = 0;
    for (int i : order) {
      int x = queries[i][0], limit = queries[i][1];
      while (at < a.length && a[at] <= limit) insert(root, a[at++]);
      out[i] = at == 0 ? -1 : query(root, x);
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(solve(new int[] {0, 1, 2, 3, 4}, new int[][] {{3, 1}, {1, 3}, {5, 6}})));
  }
}
