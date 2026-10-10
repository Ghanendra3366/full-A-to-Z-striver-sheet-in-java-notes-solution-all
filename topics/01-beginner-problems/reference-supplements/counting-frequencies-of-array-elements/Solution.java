import java.util.*;

public class Solution {
  public static Map<Integer, Integer> frequencies(int[] a) {
    Map<Integer, Integer> map = new TreeMap<>();
    for (int x : a) map.put(x, map.getOrDefault(x, 0) + 1);
    return map;
  }

  public static Map<Integer, Integer> solve(int[] a) {
    return frequencies(a);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {10, 5, 10, 15, 10, 5}));
  }
}
