import java.util.*;

public class Solution {
  public static List<List<Integer>> solve(int[] a) {
    if (a.length > 20) throw new IllegalArgumentException("output is exponential; demo limit 20");
    List<List<Integer>> out = new ArrayList<>();
    for (int mask = 0; mask < (1 << a.length); mask++) {
      List<Integer> row = new ArrayList<>();
      for (int i = 0; i < a.length; i++) if ((mask & (1 << i)) != 0) row.add(a[i]);
      out.add(row);
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2}));
  }
}
