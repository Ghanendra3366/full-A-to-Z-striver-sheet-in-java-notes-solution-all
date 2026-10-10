import java.util.*;

public class Solution {
  public static int search(int[] a, int x, boolean duplicates) {
    int l = 0, r = a.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (a[m] == x) return m;
      if (duplicates && a[l] == a[m] && a[m] == a[r]) {
        l++;
        r--;
        continue;
      }
      if (a[l] <= a[m]) {
        if (a[l] <= x && x < a[m]) r = m - 1;
        else l = m + 1;
      } else {
        if (a[m] < x && x <= a[r]) l = m + 1;
        else r = m - 1;
      }
    }
    return -1;
  }

  public static int solve(int[] a, int x) {
    return search(a, x, false);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
  }
}
