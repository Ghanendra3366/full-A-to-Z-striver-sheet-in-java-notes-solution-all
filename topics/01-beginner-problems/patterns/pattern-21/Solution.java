import java.util.*;

public class Solution {
  public static String solve(int n) {
    if (n < 0) throw new IllegalArgumentException("nonnegative n required");
    StringBuilder out = new StringBuilder();
    for (int r = 0; r < n; r++) {
      for (int c = 0; c < n; c++)
        out.append(r == 0 || c == 0 || r == n - 1 || c == n - 1 ? "*" : " ");
      out.append("\n");
    }
    return out.toString();
  }

  public static void main(String[] args) {
    System.out.print(solve(3));
  }
}
