import java.util.*;

public class Solution {
  public static int bound(int[] a, int x, boolean upper) {
    int l = 0, r = a.length;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (a[m] < x || upper && a[m] == x) l = m + 1;
      else r = m;
    }
    return l;
  }

  public static OptionalInt[] solve(int[] a, int x) {
    int lower = bound(a, x, false), upper = bound(a, x, true);
    return new OptionalInt[] {
      upper == 0 ? OptionalInt.empty() : OptionalInt.of(a[upper - 1]),
      lower == a.length ? OptionalInt.empty() : OptionalInt.of(a[lower])
    };
  }

  public static void main(String[] args) {
    OptionalInt[] ans = solve(new int[] {1, 3, 5}, 4);
    System.out.println(ans[0].getAsInt() + " " + ans[1].getAsInt());
  }
}
