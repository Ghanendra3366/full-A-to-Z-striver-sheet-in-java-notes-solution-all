import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int key = a[i], j = i - 1;
      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {5, -1, 2, 2, 0})));
  }
}
