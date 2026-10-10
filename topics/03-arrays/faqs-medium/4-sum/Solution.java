import java.util.*;

public class Solution {
  public static List<List<Integer>> solve(int[] input, long target) {
    int[] a = input.clone();
    Arrays.sort(a);
    List<List<Integer>> out = new ArrayList<>();
    for (int i = 0; i < a.length - 3; i++) {
      if (i > 0 && a[i] == a[i - 1]) continue;
      for (int j = i + 1; j < a.length - 2; j++) {
        if (j > i + 1 && a[j] == a[j - 1]) continue;
        int l = j + 1, r = a.length - 1;
        while (l < r) {
          long sum = (long) a[i] + a[j] + a[l] + a[r];
          if (sum < target) l++;
          else if (sum > target) r--;
          else {
            out.add(Arrays.asList(a[i], a[j], a[l], a[r]));
            int x = a[l], y = a[r];
            while (l < r && a[l] == x) l++;
            while (l < r && a[r] == y) r--;
          }
        }
      }
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 0, -1, 0, -2, 2}, 0));
  }
}
