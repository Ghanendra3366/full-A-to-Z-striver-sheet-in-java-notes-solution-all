import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    boolean[] seen = new boolean[a.length + 1];
    int repeat = -1;
    for (int x : a) {
      if (x < 1 || x > a.length) throw new IllegalArgumentException();
      if (seen[x]) repeat = x;
      seen[x] = true;
    }
    int missing = -1;
    for (int x = 1; x <= a.length; x++) if (!seen[x]) missing = x;
    return new int[] {repeat, missing};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {3, 1, 2, 5, 3})));
  }
}
