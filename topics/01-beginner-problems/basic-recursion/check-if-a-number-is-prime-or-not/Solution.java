import java.util.*;

public class Solution {
  public static boolean solve(int n, int d) {
    if (n < 2) return false;
    if (d > n / d) return true;
    return n % d != 0 && solve(n, d + 1);
  }

  public static void main(String[] args) {
    System.out.println(solve(97, 2));
  }
}
