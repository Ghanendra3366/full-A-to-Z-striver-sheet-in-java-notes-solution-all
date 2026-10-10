import java.util.*;

public class Solution {
  public static int solve(int[] greed, int[] sizes) {
    int[] g = greed.clone(), s = sizes.clone();
    Arrays.sort(g);
    Arrays.sort(s);
    int i = 0;
    for (int x : s) if (i < g.length && x >= g[i]) i++;
    return i;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 3}, new int[] {1, 1}));
  }
}
