import java.util.*;

public class Solution {
  public static boolean solve(int n, int i) {
    if (i < 0 || i >= 32) throw new IllegalArgumentException();
    return (n & (1 << i)) != 0;
  }

  public static void main(String[] args) {
    System.out.println(solve(10, 1));
  }
}
