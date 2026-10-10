import java.util.*;

public class Solution {
  public static List<Integer> solve(int[] a, int k) {
    Map<Integer, Integer> f = new HashMap<>();
    for (int x : a) f.put(x, f.getOrDefault(x, 0) + 1);
    if (k < 0 || k > f.size()) throw new IllegalArgumentException();
    List<Integer> keys = new ArrayList<>(f.keySet());
    keys.sort(
        (x, y) -> {
          int c = Integer.compare(f.get(y), f.get(x));
          return c != 0 ? c : Integer.compare(x, y);
        });
    return new ArrayList<>(keys.subList(0, k));
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 1, 1, 2, 2, 3}, 2));
  }
}
