import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    int[] sorted = a.clone();
    Arrays.sort(sorted);
    int[] bit = new int[a.length + 1], out = new int[a.length];
    for (int i = a.length - 1; i >= 0; i--) {
      int lo = 0, hi = sorted.length;
      while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (sorted[mid] < a[i]) lo = mid + 1;
        else hi = mid;
      }
      int rank = lo;
      int count = 0;
      for (int x = rank + 1; x > 0; x -= x & -x) count += bit[x];
      out[i] = a.length - 1 - i - count;
      for (int x = rank + 1; x < bit.length; x += x & -x) bit[x]++;
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {3, 4, 2, 7})));
  }
}
