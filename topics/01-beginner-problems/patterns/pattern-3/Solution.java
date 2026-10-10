import java.util.*;

public class Solution {
  public static String solve(int n) {
    if (n < 0) throw new IllegalArgumentException("nonnegative n required");
    StringBuilder out = new StringBuilder();
    for (int r = 1; r <= n; r++) {
      for (int c = 1; c <= r; c++) out.append(c).append(" ");
      out.append("\n");
    }
    return out.toString();
  }

  public static void main(String[] args) {
    System.out.print(solve(3));
  }
}
