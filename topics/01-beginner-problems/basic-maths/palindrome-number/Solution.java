import java.util.*;

public class Solution {
  public static boolean solve(int n) {
    if (n < 0) return false;
    long rev = 0;
    int copy = n;
    do {
      rev = rev * 10 + copy % 10;
      copy /= 10;
    } while (copy != 0);
    return rev == n;
  }

  public static void main(String[] args) {
    System.out.println(solve(1221));
  }
}
