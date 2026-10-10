import java.util.*;

public class Solution {
  public static long solve(int length, int[] input) {
    if (length < 0) throw new IllegalArgumentException();
    if (input.length == 0) return 0;
    int[] cuts = new int[input.length + 2];
    cuts[cuts.length - 1] = length;
    for (int i = 0; i < input.length; i++) {
      if (input[i] <= 0 || input[i] >= length) throw new IllegalArgumentException();
      cuts[i + 1] = input[i];
    }
    Arrays.sort(cuts);
    for (int i = 1; i < cuts.length; i++)
      if (cuts[i] == cuts[i - 1]) throw new IllegalArgumentException();
    long[][] d = new long[cuts.length][cuts.length];
    for (int span = 2; span < cuts.length; span++)
      for (int l = 0; l + span < cuts.length; l++) {
        int r = l + span;
        d[l][r] = Long.MAX_VALUE;
        for (int k = l + 1; k < r; k++)
          d[l][r] = Math.min(d[l][r], cuts[r] - cuts[l] + d[l][k] + d[k][r]);
      }
    return d[0][cuts.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(solve(7, new int[] {1, 3, 4, 5}));
  }
}
