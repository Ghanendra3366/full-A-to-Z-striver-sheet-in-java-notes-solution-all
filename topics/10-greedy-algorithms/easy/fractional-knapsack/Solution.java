import java.util.*;

public class Solution {
  public static double solve(int[][] items, int capacity) {
    if (capacity < 0) throw new IllegalArgumentException();
    int[][] a = new int[items.length][];
    for (int i = 0; i < a.length; i++) {
      a[i] = items[i].clone();
      if (a[i][0] < 0 || a[i][1] <= 0) throw new IllegalArgumentException();
    }
    Arrays.sort(a, (x, y) -> Double.compare((double) y[0] / y[1], (double) x[0] / x[1]));
    double value = 0;
    int remaining = capacity;
    for (int[] item : a) {
      int take = Math.min(remaining, item[1]);
      value += (double) item[0] * take / item[1];
      remaining -= take;
      if (remaining == 0) break;
    }
    return value;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[][] {{60, 10}, {100, 20}, {120, 30}}, 50));
  }
}
