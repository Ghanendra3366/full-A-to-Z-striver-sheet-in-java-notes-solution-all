import java.util.*;

public class Solution {
  public static long solve(int[] a, int parts) {
    if (parts <= 0) throw new IllegalArgumentException();
    if (parts > a.length) return -1;
    if (a.length == 0) return 0;
    long l = 0, r = 0;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      l = Math.max(l, x);
      r += x;
    }
    while (l < r) {
      long mid = l + (r - l) / 2, load = 0;
      int used = 1;
      for (int x : a) {
        if (load + x > mid) {
          used++;
          load = 0;
        }
        load += x;
      }
      if (used <= parts) r = mid;
      else l = mid + 1;
    }
    return l;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {7, 2, 5, 10, 8}, 2));
  }
}
