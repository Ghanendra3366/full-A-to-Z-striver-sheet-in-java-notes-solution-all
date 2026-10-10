import java.util.*;

public class Solution {
  public static long solve(int[] a) {
    long sum = 0;
    for (int x : a) sum += x;
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 3}));
  }
}
