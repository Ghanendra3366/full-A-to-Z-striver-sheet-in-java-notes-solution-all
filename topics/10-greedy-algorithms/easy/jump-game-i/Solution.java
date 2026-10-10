import java.util.*;

public class Solution {
  public static boolean solve(int[] a) {
    long far = 0;
    for (int i = 0; i < a.length; i++) {
      if (i > far) return false;
      if (a[i] < 0) throw new IllegalArgumentException();
      far = Math.max(far, (long) i + a[i]);
    }
    return a.length > 0;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 3, 1, 1, 4}));
  }
}
