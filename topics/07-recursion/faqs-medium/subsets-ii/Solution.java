import java.util.*;

public class Solution {
  private static void dfs(int[] a, int start, List<Integer> p, List<List<Integer>> out) {
    out.add(new ArrayList<>(p));
    for (int i = start; i < a.length; i++) {
      if (i > start && a[i] == a[i - 1]) continue;
      p.add(a[i]);
      dfs(a, i + 1, p, out);
      p.remove(p.size() - 1);
    }
  }

  public static List<List<Integer>> solve(int[] input) {
    int[] a = input.clone();
    Arrays.sort(a);
    List<List<Integer>> out = new ArrayList<>();
    dfs(a, 0, new ArrayList<>(), out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 2}));
  }
}
