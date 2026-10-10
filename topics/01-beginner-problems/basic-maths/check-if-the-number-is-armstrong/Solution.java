import java.util.*;

public class Solution {
  public static boolean solve(int n) {
    if (n < 0) return false;
    int d = String.valueOf(n).length(), copy = n;
    long sum = 0;
    do {
      int digit = copy % 10;
      long power = 1;
      for (int i = 0; i < d; i++) power *= digit;
      sum += power;
      copy /= 10;
    } while (copy != 0);
    return sum == n;
  }

  public static void main(String[] args) {
    System.out.println(solve(9474));
  }
}
