import java.util.*;

public class Solution {
  public static int[] solve(int[] a, int l, int r) {
    if (l >= r) return a;
    int t = a[l];
    a[l] = a[r];
    a[r] = t;
    return solve(a, l + 1, r - 1);
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {1, 2, 3}, 0, 2)));
  }
}
