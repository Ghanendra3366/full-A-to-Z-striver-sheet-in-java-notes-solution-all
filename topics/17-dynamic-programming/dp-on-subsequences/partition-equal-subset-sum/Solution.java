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

  static boolean subset(int[] a, int target) {
    return reachable(a, target)[target];
  }

  public static boolean solve(int[] a) {
    long sum = 0;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      sum += x;
    }
    if (sum % 2 != 0) return false;
    if (sum / 2 > Integer.MAX_VALUE) throw new IllegalArgumentException("target too large");
    return subset(a, (int) (sum / 2));
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 5, 11, 5}));
  }
}
