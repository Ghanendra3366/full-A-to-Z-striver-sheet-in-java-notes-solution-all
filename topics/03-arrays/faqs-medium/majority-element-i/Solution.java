import java.util.*;

public class Solution {
  public static OptionalInt solve(int[] a) {
    int candidate = 0, votes = 0;
    for (int x : a) {
      if (votes == 0) candidate = x;
      votes += x == candidate ? 1 : -1;
    }
    int count = 0;
    for (int x : a) if (x == candidate) count++;
    return count > a.length / 2 ? OptionalInt.of(candidate) : OptionalInt.empty();
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {2, 2, 1, 2}).getAsInt());
  }
}
