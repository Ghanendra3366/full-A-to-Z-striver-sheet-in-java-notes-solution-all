import java.util.*;

public class Solution {
  public static List<Integer> solve(int[] a) {
    List<Integer> out = new ArrayList<>();
    long best = Long.MIN_VALUE;
    for (int i = a.length - 1; i >= 0; i--)
      if (a[i] > best) {
        out.add(a[i]);
        best = a[i];
      }
    Collections.reverse(out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {16, 17, 4, 3, 5, 2}));
  }
}
