import java.util.*;

public class Solution {
  public static List<Integer> solve(int n) {
    if (n <= 0) throw new IllegalArgumentException("positive n required");
    List<Integer> low = new ArrayList<>(), high = new ArrayList<>();
    for (int d = 1; d <= n / d; d++)
      if (n % d == 0) {
        low.add(d);
        if (d != n / d) high.add(n / d);
      }
    Collections.reverse(high);
    low.addAll(high);
    return low;
  }

  public static void main(String[] args) {
    System.out.println(solve(36));
  }
}
