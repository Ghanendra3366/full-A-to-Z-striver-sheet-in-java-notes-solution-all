import java.util.*;

public class Solution {
  public static int[] solve(int a, int b) {
    a ^= b;
    b ^= a;
    a ^= b;
    return new int[] {a, b};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(3, 7)));
  }
}
