import java.util.*;

public class Solution {
  public static int[][] sorted(int[][] intervals) {
    int[][] a = new int[intervals.length][];
    for (int i = 0; i < a.length; i++) {
      a[i] = intervals[i].clone();
      if (a[i][0] > a[i][1]) throw new IllegalArgumentException();
    }
    return a;
  }

  public static int solve(int[][] input) {
    int[][] a = sorted(input);
    Arrays.sort(a, (x, y) -> Integer.compare(x[1], y[1]));
    long end = Long.MIN_VALUE;
    int count = 0;
    for (int[] x : a)
      if (x[0] > end) {
        count++;
        end = x[1];
      }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{1, 2}, {3, 4}, {0, 6}, {5, 7}, {8, 9}, {5, 9}}));
  }
}
