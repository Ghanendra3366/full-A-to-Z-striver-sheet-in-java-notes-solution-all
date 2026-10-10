import java.util.*;

public class Solution {
  private static boolean dfs(int[] a, int i, long remaining) {
    if (i == a.length) return remaining == 0;
    return dfs(a, i + 1, remaining) || dfs(a, i + 1, remaining - a[i]);
  }

  public static boolean solve(int[] a, long k) {
    return dfs(a, 0, k);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 1}, 2));
  }
}
