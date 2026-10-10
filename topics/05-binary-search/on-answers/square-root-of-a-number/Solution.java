import java.util.*;

public class Solution {
  public static int solve(int n) {
    if (n < 0) throw new IllegalArgumentException();
    int l = 1, r = n, ans = 0;
    while (l <= r) {
      int m = l + (r - l) / 2;
      if (m <= n / m) {
        ans = m;
        l = m + 1;
      } else r = m - 1;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(solve(Integer.MAX_VALUE));
  }
}
