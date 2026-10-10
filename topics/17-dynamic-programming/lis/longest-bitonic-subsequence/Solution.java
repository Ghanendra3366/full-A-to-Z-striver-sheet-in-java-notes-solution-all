import java.util.*;

public class Solution {
  static int[] lisLengths(int[] a) {
    int[] d = new int[a.length];
    Arrays.fill(d, 1);
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < i; j++) if (a[j] < a[i]) d[i] = Math.max(d[i], d[j] + 1);
    return d;
  }

  public static int solve(int[] a) {
    int[] up = lisLengths(a), down = new int[a.length];
    Arrays.fill(down, 1);
    for (int i = a.length - 1; i >= 0; i--)
      for (int j = i + 1; j < a.length; j++)
        if (a[j] < a[i]) down[i] = Math.max(down[i], down[j] + 1);
    int best = 0;
    for (int i = 0; i < a.length; i++) best = Math.max(best, up[i] + down[i] - 1);
    return best;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 11, 2, 10, 4, 5, 2, 1}));
  }
}
