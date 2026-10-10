import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    insertion(a, a.length);
    return a;
  }

  private static void insertion(int[] a, int n) {
    if (n <= 1) return;
    insertion(a, n - 1);
    int key = a[n - 1], j = n - 2;
    while (j >= 0 && a[j] > key) {
      a[j + 1] = a[j];
      j--;
    }
    a[j + 1] = key;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {5, -1, 2, 2, 0})));
  }
}
