import java.util.*;

public class Solution {
  public static boolean solve(int[] a) {
    for (int i = 1; i < a.length; i++) if (a[i] < a[i - 1]) return false;
    return true;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 1, 3}));
  }
}
