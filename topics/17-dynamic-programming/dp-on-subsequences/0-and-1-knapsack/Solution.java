import java.util.*;

public class Solution {
  public static long solve(int[] weight, int[] value, int capacity) {
    if (capacity < 0 || weight.length != value.length) throw new IllegalArgumentException();
    long[] d = new long[capacity + 1];
    for (int i = 0; i < weight.length; i++) {
      if (weight[i] <= 0) throw new IllegalArgumentException();
      for (int c = capacity; c >= weight[i]; c--)
        d[c] = Math.max(d[c], value[i] + d[c - weight[i]]);
    }
    return d[capacity];
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 3}, new int[] {4, 5}, 6));
  }
}
