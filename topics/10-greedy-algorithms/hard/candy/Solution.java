import java.util.*;

public class Solution {
  public static long solve(int[] a) {
    if (a.length == 0) return 0;
    int[] candy = new int[a.length];
    Arrays.fill(candy, 1);
    for (int i = 1; i < a.length; i++) if (a[i] > a[i - 1]) candy[i] = candy[i - 1] + 1;
    for (int i = a.length - 2; i >= 0; i--)
      if (a[i] > a[i + 1]) candy[i] = Math.max(candy[i], candy[i + 1] + 1);
    long sum = 0;
    for (int x : candy) sum += x;
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 0, 2}));
  }
}
