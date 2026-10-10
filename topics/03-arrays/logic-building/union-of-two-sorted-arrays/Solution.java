import java.util.*;

public class Solution {
  public static List<Integer> solve(int[] a, int[] b) {
    List<Integer> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < a.length || j < b.length) {
      int x = j == b.length || (i < a.length && a[i] <= b[j]) ? a[i++] : b[j++];
      if (result.isEmpty() || result.get(result.size() - 1) != x) result.add(x);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 2, 4}, new int[] {2, 2, 3}));
  }
}
