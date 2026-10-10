import java.util.*;

public class Solution {
  public static boolean solve(int n) {
    if (n <= 1) return false;
    long sum = 1;
    for (int d = 2; d <= n / d; d++)
      if (n % d == 0) {
        sum += d;
        if (d != n / d) sum += n / d;
      }
    return sum == n;
  }

  public static void main(String[] args) {
    System.out.println(solve(28));
  }
}
