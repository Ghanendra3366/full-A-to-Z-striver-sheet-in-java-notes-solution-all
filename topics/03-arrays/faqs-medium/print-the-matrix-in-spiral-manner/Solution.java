import java.util.*;

public class Solution {
  public static List<Integer> solve(int[][] a) {
    List<Integer> out = new ArrayList<>();
    if (a.length == 0 || a[0].length == 0) return out;
    int top = 0, bottom = a.length - 1, left = 0, right = a[0].length - 1;
    while (top <= bottom && left <= right) {
      for (int c = left; c <= right; c++) out.add(a[top][c]);
      top++;
      for (int r = top; r <= bottom; r++) out.add(a[r][right]);
      right--;
      if (top <= bottom) {
        for (int c = right; c >= left; c--) out.add(a[bottom][c]);
        bottom--;
      }
      if (left <= right) {
        for (int r = bottom; r >= top; r--) out.add(a[r][left]);
        left++;
      }
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
  }
}
