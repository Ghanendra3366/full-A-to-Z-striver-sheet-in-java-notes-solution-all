import java.util.*;

public class Solution {
  static void dfs(int[] a, int i, long sum, List<Long> out) {
    if (i == a.length) {
      out.add(sum);
      return;
    }
    dfs(a, i + 1, sum, out);
    dfs(a, i + 1, sum + a[i], out);
  }

  public static List<Long> solve(int[] a) {
    List<Long> out = new ArrayList<>();
    dfs(a, 0, 0, out);
    Collections.sort(out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2}));
  }
}
