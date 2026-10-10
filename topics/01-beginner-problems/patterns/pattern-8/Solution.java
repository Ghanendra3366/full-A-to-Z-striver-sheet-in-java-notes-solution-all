import java.util.*;

public class Solution {
  public static String solve(int n) {
    if (n < 0) throw new IllegalArgumentException("nonnegative n required");
    StringBuilder out = new StringBuilder();
    for (int r = n; r >= 1; r--) {
      for (int c = 0; c < n - r; c++) out.append(" ");
      for (int c = 0; c < 2 * r - 1; c++) out.append("*");
      out.append("\n");
    }
    return out.toString();
  }

  public static void main(String[] args) {
    System.out.print(solve(3));
  }
}
