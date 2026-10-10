import java.util.*;

public class Solution {
  public static int solve(int a, int b) {
    return Integer.bitCount(a ^ b);
  }

  public static void main(String[] args) {
    System.out.println(solve(10, 7));
  }
}
