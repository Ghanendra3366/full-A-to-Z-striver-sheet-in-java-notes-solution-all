import java.util.*;

public class Solution {
  public static int solve(int[] a, int target) {
    for (int i = 0; i < a.length; i++) if (a[i] == target) return i;
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {4, 2, 4}, 4));
  }
}
