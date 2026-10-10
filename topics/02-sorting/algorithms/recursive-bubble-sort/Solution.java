import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    bubble(a, a.length);
    return a;
  }

  private static void bubble(int[] a, int n) {
    if (n <= 1) return;
    boolean changed = false;
    for (int i = 0; i < n - 1; i++)
      if (a[i] > a[i + 1]) {
        int t = a[i];
        a[i] = a[i + 1];
        a[i + 1] = t;
        changed = true;
      }
    if (changed) bubble(a, n - 1);
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {5, -1, 2, 2, 0})));
  }
}
