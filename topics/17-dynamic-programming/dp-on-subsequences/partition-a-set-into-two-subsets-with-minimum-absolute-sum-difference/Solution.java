import java.util.*;

public class Solution {
  static boolean[] reachable(int[] a, int target) {
    if (target < 0) throw new IllegalArgumentException();
    boolean[] d = new boolean[target + 1];
    d[0] = true;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      for (int s = target; s >= x; s--) d[s] |= d[s - x];
    }
    return d;
  }

  public static boolean solve(int[] a, int target) {
    return reachable(a, target)[target];
  }

  public static long difference(int[] a) {
    long total = 0;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      total += x;
    }
    if (total / 2 > Integer.MAX_VALUE) throw new IllegalArgumentException();
    boolean[] d = reachable(a, (int) (total / 2));
    for (int s = d.length - 1; s >= 0; s--) if (d[s]) return total - 2L * s;
    throw new IllegalStateException();
  }

  public static void main(String[] args) {
    System.out.println(difference(new int[] {1, 6, 11, 5}));
  }
}
