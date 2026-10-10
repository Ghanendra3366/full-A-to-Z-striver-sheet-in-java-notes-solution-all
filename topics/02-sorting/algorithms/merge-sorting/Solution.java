import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    merge(a, new int[a.length], 0, a.length);
    return a;
  }

  private static void merge(int[] a, int[] tmp, int l, int r) {
    if (r - l <= 1) return;
    int m = l + (r - l) / 2;
    merge(a, tmp, l, m);
    merge(a, tmp, m, r);
    int i = l, j = m, k = l;
    while (i < m && j < r) tmp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
    while (i < m) tmp[k++] = a[i++];
    while (j < r) tmp[k++] = a[j++];
    System.arraycopy(tmp, l, a, l, r - l);
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {5, -1, 2, 2, 0})));
  }
}
