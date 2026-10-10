import java.util.*;

public class Solution {
  public static long solve(int n) {
    if (n < 0 || n > 92) throw new IllegalArgumentException("0<=n<=92");
    long a = 0, b = 1;
    for (int i = 0; i < n; i++) {
      long next = a + b;
      a = b;
      b = next;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(solve(10));
  }
}
