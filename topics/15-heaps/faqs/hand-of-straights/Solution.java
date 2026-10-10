import java.util.*;

public class Solution {
  public static boolean solve(int[] hand, int group) {
    if (group <= 0) throw new IllegalArgumentException();
    if (hand.length % group != 0) return false;
    TreeMap<Integer, Integer> count = new TreeMap<>();
    for (int x : hand) count.put(x, count.getOrDefault(x, 0) + 1);
    while (!count.isEmpty()) {
      int start = count.firstKey();
      for (int i = 0; i < group; i++) {
        long value = (long) start + i;
        if (value > Integer.MAX_VALUE) return false;
        int x = (int) value;
        Integer f = count.get(x);
        if (f == null) return false;
        if (f == 1) count.remove(x);
        else count.put(x, f - 1);
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
  }
}
