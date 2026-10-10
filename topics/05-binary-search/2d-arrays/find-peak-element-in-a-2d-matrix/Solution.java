import java.util.*;

public class Solution {
  public static int[] solve(int[][] a) {
    if (a.length == 0 || a[0].length == 0) return new int[] {-1, -1};
    int l = 0, r = a[0].length - 1;
    while (l <= r) {
      int c = l + (r - l) / 2, row = 0;
      for (int i = 1; i < a.length; i++) if (a[i][c] > a[row][c]) row = i;
      long left = c == 0 ? Long.MIN_VALUE : a[row][c - 1],
          right = c + 1 == a[0].length ? Long.MIN_VALUE : a[row][c + 1];
      if (a[row][c] > left && a[row][c] > right) return new int[] {row, c};
      if (left > a[row][c]) r = c - 1;
      else l = c + 1;
    }
    return new int[] {-1, -1};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[][] {{1, 4}, {3, 2}})));
  }
}
