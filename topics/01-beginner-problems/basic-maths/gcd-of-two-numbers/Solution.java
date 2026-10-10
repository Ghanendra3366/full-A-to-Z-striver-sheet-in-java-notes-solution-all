import java.util.*;

public class Solution {
  public static long solve(int a, int b) {
    long x = Math.abs((long) a), y = Math.abs((long) b);
    while (y != 0) {
      long r = x % y;
      x = y;
      y = r;
    }
    return x;
  }

  public static void main(String[] args) {
    System.out.println(solve(48, 18));
  }
}
