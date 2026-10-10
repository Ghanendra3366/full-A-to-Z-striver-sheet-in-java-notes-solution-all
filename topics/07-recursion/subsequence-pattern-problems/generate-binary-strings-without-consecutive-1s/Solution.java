import java.util.*;

public class Solution {
  private static void dfs(int n, StringBuilder p, List<String> out) {
    if (p.length() == n) {
      out.add(p.toString());
      return;
    }
    boolean canOne = p.length() == 0 || p.charAt(p.length() - 1) == '0';
    p.append('0');
    dfs(n, p, out);
    p.deleteCharAt(p.length() - 1);
    if (canOne) {
      p.append('1');
      dfs(n, p, out);
      p.deleteCharAt(p.length() - 1);
    }
  }

  public static List<String> solve(int n) {
    if (n < 0) throw new IllegalArgumentException();
    List<String> out = new ArrayList<>();
    dfs(n, new StringBuilder(), out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(3));
  }
}
