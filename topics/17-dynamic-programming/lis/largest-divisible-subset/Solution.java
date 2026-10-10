import java.util.*;

public class Solution {
  public static List<Integer> solve(int[] input) {
    int[] a = input.clone();
    for (int x : a) if (x <= 0) throw new IllegalArgumentException();
    Arrays.sort(a);
    int[] d = new int[a.length], parent = new int[a.length];
    Arrays.fill(d, 1);
    Arrays.fill(parent, -1);
    int best = -1;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < i; j++)
        if (a[i] % a[j] == 0 && d[j] + 1 > d[i]) {
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
    System.out.println(solve(new int[] {1, 2, 4, 8}));
  }
}
