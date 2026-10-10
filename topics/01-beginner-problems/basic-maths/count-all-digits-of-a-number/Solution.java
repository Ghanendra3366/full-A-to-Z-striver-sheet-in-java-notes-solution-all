import java.util.*;

public class Solution {
  public static int solve(int n) {
    int count = 0;
    do {
      count++;
      n /= 10;
    } while (n != 0);
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve(Integer.MIN_VALUE));
  }
}
