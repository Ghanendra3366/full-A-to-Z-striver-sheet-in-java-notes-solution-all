import java.util.*;

public class Solution {
  public static double solve(int[] bursts) {
    if (bursts.length == 0) return 0;
    int[] a = bursts.clone();
    Arrays.sort(a);
    long elapsed = 0, total = 0;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      total += elapsed;
      elapsed += x;
    }
    return (double) total / a.length;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {3, 1, 2}));
  }
}
