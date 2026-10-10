import java.util.*;

public class Solution {
  public static int solve(int[] a) {
    int run = 0, best = 0;
    for (int x : a) {
      run = x == 1 ? run + 1 : 0;
      best = Math.max(best, run);
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 1, 0, 1, 1, 1}));
  }
}
