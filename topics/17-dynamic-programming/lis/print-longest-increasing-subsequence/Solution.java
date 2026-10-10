import java.util.*;

public class Solution {
  public static List<Integer> solve(int[] a) {
    int n = a.length;
    int[] d = new int[n], parent = new int[n];
    Arrays.fill(d, 1);
    Arrays.fill(parent, -1);
    int best = -1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++)
        if (a[j] < a[i] && d[j] + 1 > d[i]) {
          d[i] = d[j] + 1;
          parent[i] = j;
        }
      if (best < 0 || d[i] > d[best]) best = i;
    }
    List<Integer> out = new ArrayList<>();
    while (best >= 0) {
      out.add(a[best]);
      best = parent[best];
    }
    Collections.reverse(out);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
  }
}
