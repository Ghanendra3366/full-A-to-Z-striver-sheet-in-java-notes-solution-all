import java.util.*;

public class Solution {
  public static boolean solve(int[] a, int i) {
    return i + 1 >= a.length || (a[i] <= a[i + 1] && solve(a, i + 1));
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 2}, 0));
  }
}
