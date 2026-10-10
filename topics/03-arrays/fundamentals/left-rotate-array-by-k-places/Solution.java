import java.util.*;

public class Solution {
  private static void reverse(int[] a, int l, int r) {
    while (l < r) {
      int t = a[l];
      a[l++] = a[r];
      a[r--] = t;
    }
  }

  public static int[] solve(int[] a, int k) {
    if (a.length == 0) return a;
    k = Math.floorMod(k, a.length);
    reverse(a, 0, k - 1);
    reverse(a, k, a.length - 1);
    reverse(a, 0, a.length - 1);
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {1, 2, 3, 4, 5}, 2)));
  }
}
