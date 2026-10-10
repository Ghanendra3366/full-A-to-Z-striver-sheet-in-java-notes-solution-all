import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    for (int l = 0, r = a.length - 1; l < r; l++, r--) {
      int t = a[l];
      a[l] = a[r];
      a[r] = t;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {1, 2, 3})));
  }
}
