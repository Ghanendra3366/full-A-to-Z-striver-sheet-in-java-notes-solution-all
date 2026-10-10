import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int best = i;
      for (int j = i + 1; j < a.length; j++) if (a[j] < a[best]) best = j;
      int t = a[i];
      a[i] = a[best];
      a[best] = t;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {5, -1, 2, 2, 0})));
  }
}
