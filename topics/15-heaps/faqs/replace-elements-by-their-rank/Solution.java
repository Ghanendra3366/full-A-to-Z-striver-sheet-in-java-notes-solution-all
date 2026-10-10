import java.util.*;

public class Solution {
  public static int[] solve(int[] input) {
    int[] sorted = input.clone();
    Arrays.sort(sorted);
    Map<Integer, Integer> rank = new HashMap<>();
    for (int x : sorted) if (!rank.containsKey(x)) rank.put(x, rank.size() + 1);
    int[] out = new int[input.length];
    for (int i = 0; i < out.length; i++) out[i] = rank.get(input[i]);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {40, 10, 20, 30, 20})));
  }
}
