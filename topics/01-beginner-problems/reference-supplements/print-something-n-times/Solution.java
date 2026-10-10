import java.util.*;

public class Solution {
  static void dfs(int n, List<String> out) {
    if (n == 0) return;
    out.add("Hello");
    dfs(n - 1, out);
  }

  public static List<String> solve(int n) {
    if (n < 0) throw new IllegalArgumentException();
    List<String> out = new ArrayList<>();
    dfs(n, out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(3));
  }
}
