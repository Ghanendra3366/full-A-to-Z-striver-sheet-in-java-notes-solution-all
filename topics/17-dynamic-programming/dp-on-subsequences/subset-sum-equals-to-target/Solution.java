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

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 3, 4}, 6));
  }
}
