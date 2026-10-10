import java.util.*;

public class Solution {
  public static int solve(int[] a) {
    if (a.length == 0) throw new IllegalArgumentException("nonempty input required");
    int best = a[0];
    for (int x : a) best = Math.max(best, x);
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {-5, -2, -9}));
  }
}
