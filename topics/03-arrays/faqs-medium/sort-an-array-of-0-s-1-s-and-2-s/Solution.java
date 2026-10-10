import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    for (int x : a) if (x < 0 || x > 2) throw new IllegalArgumentException();
    int low = 0, mid = 0, high = a.length - 1;
    while (mid <= high) {
      if (a[mid] == 0) {
        int t = a[low];
        a[low++] = a[mid];
        a[mid++] = t;
      } else if (a[mid] == 1) mid++;
      else {
        int t = a[high];
        a[high--] = a[mid];
        a[mid] = t;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {2, 0, 2, 1, 1, 0})));
  }
}
