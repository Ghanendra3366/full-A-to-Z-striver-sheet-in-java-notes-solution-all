import java.util.*;

public class Solution {
  public static int solve(int[] a) {
    int[] tails = new int[a.length];
    int size = 0;
    for (int x : a) {
      int l = 0, r = size;
      while (l < r) {
        int m = l + (r - l) / 2;
        if (tails[m] < x) l = m + 1;
        else r = m;
      }
      tails[l] = x;
      if (l == size) size++;
    }
    return size;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
  }
}
