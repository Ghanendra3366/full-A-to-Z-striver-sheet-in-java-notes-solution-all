import java.util.*;

public class Solution {
  public static long solve(int[] a) {
    int l = 0, r = a.length - 1, left = 0, right = 0;
    long water = 0;
    while (l <= r) {
      if (left <= right) {
        if (a[l] < 0) throw new IllegalArgumentException();
        left = Math.max(left, a[l]);
        water += left - a[l++];
      } else {
        if (a[r] < 0) throw new IllegalArgumentException();
        right = Math.max(right, a[r]);
        water += right - a[r--];
      }
    }
    return water;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
  }
}
