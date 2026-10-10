import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    int write = 0;
    for (int x : a) if (x != 0) a[write++] = x;
    while (write < a.length) a[write++] = 0;
    return a;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {0, 1, 0, 3, 2})));
  }
}
