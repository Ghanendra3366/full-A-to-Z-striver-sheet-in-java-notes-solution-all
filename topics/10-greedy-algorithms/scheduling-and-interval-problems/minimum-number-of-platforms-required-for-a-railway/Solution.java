import java.util.*;

public class Solution {
  public static int solve(int[] arrival, int[] departure) {
    if (arrival.length != departure.length) throw new IllegalArgumentException();
    int[] a = arrival.clone(), d = departure.clone();
    Arrays.sort(a);
    Arrays.sort(d);
    int i = 0, j = 0, active = 0, best = 0;
    while (i < a.length) {
      if (j == d.length || a[i] <= d[j]) {
        active++;
        best = Math.max(best, active);
        i++;
      } else {
        active--;
        j++;
      }
    }
    return best;
  }

  public static void main(String[] args) {
    System.out.println(
        solve(
            new int[] {900, 940, 950, 1100, 1500, 1800},
            new int[] {910, 1200, 1120, 1130, 1900, 2000}));
  }
}
