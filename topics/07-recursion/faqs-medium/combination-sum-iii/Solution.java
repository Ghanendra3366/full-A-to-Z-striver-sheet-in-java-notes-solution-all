import java.util.*;

public class Solution {
  private static void dfs(int start, int k, int sum, List<Integer> p, List<List<Integer>> out) {
    if (k == 0) {
      if (sum == 0) out.add(new ArrayList<>(p));
      return;
    }
    for (int x = start; x <= 9 && x <= sum; x++) {
      p.add(x);
      dfs(x + 1, k - 1, sum - x, p, out);
      p.remove(p.size() - 1);
    }
  }

  public static List<List<Integer>> solve(int k, int target) {
    if (k < 0) throw new IllegalArgumentException();
    List<List<Integer>> out = new ArrayList<>();
    dfs(1, k, target, new ArrayList<>(), out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(3, 9));
  }
}
