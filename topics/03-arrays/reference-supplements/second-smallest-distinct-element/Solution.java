import java.util.*;

public class Solution {
  public static OptionalInt solve(int[] a) {
    Integer first = null, second = null;
    for (int x : a) {
      if (first == null || x < first) {
        second = first;
        first = x;
      } else if (x > first && (second == null || x < second)) second = x;
    }
    return second == null ? OptionalInt.empty() : OptionalInt.of(second);
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {4, 1, 1, 2}).getAsInt());
  }
}
