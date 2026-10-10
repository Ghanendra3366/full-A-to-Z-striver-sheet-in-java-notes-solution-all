import java.util.*;

public class Solution {
  public static long solve(int[][] a) {
    if (a.length == 0) return 0;
    int[] prev = new int[a[0].length + 1];
    long total = 0;
    for (int[] row : a) {
      int[] next = new int[prev.length];
      for (int c = 1; c < next.length; c++)
        if (row[c - 1] == 1) {
          next[c] = 1 + Math.min(prev[c], Math.min(prev[c - 1], next[c - 1]));
          total += next[c];
        }
      prev = next;
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 1}, {1, 1}}));
  }
}
