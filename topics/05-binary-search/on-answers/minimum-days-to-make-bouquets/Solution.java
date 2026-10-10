import java.util.*;

public class Solution {
  private static boolean possible(int[] a, int day, int m, int k) {
    int run = 0, made = 0;
    for (int x : a) {
      if (x <= day) {
        if (++run == k) {
          made++;
          run = 0;
        }
      } else run = 0;
    }
    return made >= m;
  }

  public static int solve(int[] a, int m, int k) {
    if (m < 0 || k <= 0) throw new IllegalArgumentException();
    if (m == 0) return 0;
    if ((long) m * k > a.length) return -1;
    int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
    for (int x : a) {
      if (x < 0) throw new IllegalArgumentException();
      l = Math.min(l, x);
      r = Math.max(r, x);
    }
    while (l < r) {
      int mid = l + (r - l) / 2;
      if (possible(a, mid, m, k)) r = mid;
      else l = mid + 1;
    }
    return l;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 10, 3, 10, 2}, 3, 1));
  }
}
