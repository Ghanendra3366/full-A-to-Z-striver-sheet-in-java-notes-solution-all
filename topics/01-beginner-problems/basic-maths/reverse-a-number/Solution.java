import java.util.*;

public class Solution {
  public static long solve(int n) {
    long reversed = 0;
    while (n != 0) {
      reversed = reversed * 10 + n % 10;
      n /= 10;
    }
    return reversed;
  }

  public static void main(String[] args) {
    System.out.println(solve(-120));
  }
}
