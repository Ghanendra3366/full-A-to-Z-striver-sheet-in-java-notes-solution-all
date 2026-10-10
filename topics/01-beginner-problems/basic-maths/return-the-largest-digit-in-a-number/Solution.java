import java.util.*;

public class Solution {
  public static int solve(int n) {
    int largest = 0;
    do {
      largest = Math.max(largest, Math.abs(n % 10));
      n /= 10;
    } while (n != 0);
    return largest;
  }

  public static void main(String[] args) {
    System.out.println(solve(-293));
  }
}
