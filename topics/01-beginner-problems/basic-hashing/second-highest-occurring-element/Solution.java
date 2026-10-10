import java.util.*;

public class Solution {
  public static Map<Integer, Integer> frequencies(int[] a) {
    Map<Integer, Integer> map = new TreeMap<>();
    for (int x : a) map.put(x, map.getOrDefault(x, 0) + 1);
    return map;
  }

  public static OptionalInt solve(int[] a) {
    List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencies(a).entrySet());
    entries.sort(
        (x, y) -> {
          int c = Integer.compare(y.getValue(), x.getValue());
          return c != 0 ? c : Integer.compare(x.getKey(), y.getKey());
        });
    return entries.size() < 2 ? OptionalInt.empty() : OptionalInt.of(entries.get(1).getKey());
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 1, 2, 2, 2, 3}).getAsInt());
  }
}
