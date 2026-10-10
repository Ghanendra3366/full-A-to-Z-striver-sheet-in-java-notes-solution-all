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

  public static int[][] merge(int[][] input) {
    int[][] a = sorted(input);
    Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
    List<int[]> out = new ArrayList<>();
    for (int[] x : a) {
      if (out.isEmpty() || out.get(out.size() - 1)[1] < x[0]) out.add(x.clone());
      else {
        int[] last = out.get(out.size() - 1);
        last[1] = Math.max(last[1], x[1]);
      }
    }
    return out.toArray(new int[out.size()][]);
  }

  public static int[][] solve(int[][] a, int[] x) {
    int[][] all = Arrays.copyOf(a, a.length + 1);
    all[a.length] = x;
    return merge(all);
  }

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(solve(new int[][] {{1, 3}, {6, 9}}, new int[] {2, 5})));
  }
}
