import java.util.*;

public class Solution {
  private static long atMost(int[] a, int goal) {
    if (goal < 0) return 0;
    int l = 0;
    long sum = 0, ans = 0;
    for (int r = 0; r < a.length; r++) {
      sum += a[r];
      while (sum > goal) sum -= a[l++];
      ans += r - l + 1;
    }
    return ans;
  }

  private static long count(int[] a, int goal) {
    return atMost(a, goal) - atMost(a, goal - 1);
  }

  public static long solve(int[] a, int k) {
    int[] parity = new int[a.length];
    for (int i = 0; i < a.length; i++) parity[i] = a[i] & 1;
    return count(parity, k);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 1, 2, 1, 1}, 3));
  }
}
