import java.util.*;

public class Solution {
  public static int solve(int[] a, int[] b, int k) {
    if (k < 1 || k > a.length + b.length) throw new IllegalArgumentException();
    if (a.length > b.length) return solve(b, a, k);
    int l = Math.max(0, k - b.length), r = Math.min(k, a.length);
    while (l <= r) {
      int x = l + (r - l) / 2, y = k - x;
      long al = x == 0 ? Long.MIN_VALUE : a[x - 1],
          ar = x == a.length ? Long.MAX_VALUE : a[x],
          bl = y == 0 ? Long.MIN_VALUE : b[y - 1],
          br = y == b.length ? Long.MAX_VALUE : b[y];
      if (al <= br && bl <= ar) return (int) Math.max(al, bl);
      if (al > br) r = x - 1;
      else l = x + 1;
    }
    throw new IllegalArgumentException("arrays not sorted");
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 3, 6, 7, 9}, new int[] {1, 4, 8, 10}, 5));
  }
}
