import java.util.*;

public class Solution {
  public static int solve(int n) {
    int count = 0;
    while (n != 0) {
      if ((n % 10) % 2 != 0) count++;
      n /= 10;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve(-13520));
  }
}
