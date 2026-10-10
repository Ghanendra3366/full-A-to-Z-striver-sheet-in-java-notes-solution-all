import java.util.*;

public class Solution {
  public static long solve(int[][] points) {
    if (points.length == 0) return 0;
    long[] prev = new long[3];
    for (int task = 0; task < 3; task++) prev[task] = points[0][task];
    for (int day = 1; day < points.length; day++) {
      long[] next = new long[3];
      for (int t = 0; t < 3; t++)
        next[t] = points[day][t] + Math.max(prev[(t + 1) % 3], prev[(t + 2) % 3]);
      prev = next;
    }
    return Math.max(prev[0], Math.max(prev[1], prev[2]));
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}}));
  }
}
