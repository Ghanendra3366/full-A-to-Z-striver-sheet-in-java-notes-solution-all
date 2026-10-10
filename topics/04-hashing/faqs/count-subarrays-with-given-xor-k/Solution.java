import java.util.*;

public class Solution {
  public static long solve(int[] a, int k) {
    Map<Integer, Long> count = new HashMap<>();
    count.put(0, 1L);
    int prefix = 0;
    long ans = 0;
    for (int x : a) {
      prefix ^= x;
      ans += count.getOrDefault(prefix ^ k, 0L);
      count.put(prefix, count.getOrDefault(prefix, 0L) + 1);
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {4, 2, 2, 6, 4}, 6));
  }
}
