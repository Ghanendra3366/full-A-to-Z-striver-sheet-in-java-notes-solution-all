import java.util.*;

public class Solution {
  public static boolean solve(int[][] a, int x) {
    if (a.length == 0 || a[0].length == 0) return false;
    int r = 0, c = a[0].length - 1;
    while (r < a.length && c >= 0) {
      if (a[r][c] == x) return true;
      if (a[r][c] > x) c--;
      else r++;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}, 6));
  }
}
