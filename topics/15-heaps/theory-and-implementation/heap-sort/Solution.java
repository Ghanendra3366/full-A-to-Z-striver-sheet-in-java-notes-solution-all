import java.util.*;

public class Solution {
  static void down(int[] a, int i, int n, boolean min) {
    while (true) {
      int best = i, l = 2 * i + 1, r = l + 1;
      if (l < n && (min ? a[l] < a[best] : a[l] > a[best])) best = l;
      if (r < n && (min ? a[r] < a[best] : a[r] > a[best])) best = r;
      if (best == i) return;
      int t = a[i];
      a[i] = a[best];
      a[best] = t;
      i = best;
    }
  }

  static int[] build(int[] a, boolean min) {
    for (int i = a.length / 2 - 1; i >= 0; i--) down(a, i, a.length, min);
    return a;
  }

  public static int[] solve(int[] a) {
    build(a, false);
    for (int end = a.length - 1; end > 0; end--) {
      int t = a[0];
      a[0] = a[end];
      a[end] = t;
      down(a, 0, end, false);
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {4, 1, 3, 2})));
  }
}
