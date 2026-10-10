import java.util.*;

public class Solution {
  public static long solve(int[] h, int k) {
    if (k < 1) throw new IllegalArgumentException();
    if (h.length == 0) return 0;
    long[] d = new long[h.length];
    Arrays.fill(d, Long.MAX_VALUE);
    d[0] = 0;
    for (int i = 1; i < h.length; i++)
      for (int jump = 1; jump <= k && jump <= i; jump++)
        d[i] = Math.min(d[i], d[i - jump] + Math.abs((long) h[i] - h[i - jump]));
    return d[h.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {10, 20, 30, 10}, 3));
  }
}
