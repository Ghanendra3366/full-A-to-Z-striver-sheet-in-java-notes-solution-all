import java.util.*;

public class Solution {
  public static int solve(int[] a) {
    int count = 0;
    for (int x : a) if (x % 2 != 0) count++;
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {-3, 2, 5}));
  }
}
