import java.util.*;

public class Solution {
  public static String solve(int n) {
    if (n < 0) throw new IllegalArgumentException("nonnegative n required");
    StringBuilder out = new StringBuilder();
    for (int row = 1; row < 2 * n; row++) {
      int r = row <= n ? row : 2 * n - row;
      for (int c = 0; c < r; c++) out.append("* ");
      out.append("\n");
    }
    return out.toString();
  }

  public static void main(String[] args) {
    System.out.print(solve(3));
  }
}
