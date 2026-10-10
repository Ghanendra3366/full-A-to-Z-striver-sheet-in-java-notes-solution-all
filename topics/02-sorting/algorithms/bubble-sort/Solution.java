import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    for (int end = a.length - 1; end > 0; end--) {
      boolean changed = false;
      for (int j = 0; j < end; j++)
        if (a[j] > a[j + 1]) {
          int t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
          changed = true;
        }
      if (!changed) break;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {5, -1, 2, 2, 0})));
  }
}
