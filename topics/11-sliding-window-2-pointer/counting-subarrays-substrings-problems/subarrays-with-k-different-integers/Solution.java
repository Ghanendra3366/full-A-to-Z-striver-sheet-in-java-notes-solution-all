import java.util.*;

public class Solution {
  private static long atMost(int[] a, int k) {
    if (k < 0) return 0;
    Map<Integer, Integer> count = new HashMap<>();
    int l = 0;
    long ans = 0;
    for (int r = 0; r < a.length; r++) {
      count.put(a[r], count.getOrDefault(a[r], 0) + 1);
      while (count.size() > k) {
        int x = a[l++], v = count.get(x) - 1;
        if (v == 0) count.remove(x);
        else count.put(x, v);
      }
      ans += r - l + 1;
    }
    return ans;
  }

  public static long solve(int[] a, int k) {
    return atMost(a, k) - atMost(a, k - 1);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 1, 2, 3}, 2));
  }
}
