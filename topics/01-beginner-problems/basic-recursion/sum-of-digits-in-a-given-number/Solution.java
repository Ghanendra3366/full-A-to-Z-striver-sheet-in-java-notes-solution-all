import java.util.*;

public class Solution {
  public static int solve(int n) {
    return n == 0 ? 0 : Math.abs(n % 10) + solve(n / 10);
  }

  public static void main(String[] args) {
    System.out.println(solve(-123));
  }
}
