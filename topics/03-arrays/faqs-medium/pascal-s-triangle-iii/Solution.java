import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static List<List<BigInteger>> solve(int n) {
    if (n < 0) throw new IllegalArgumentException();
    List<List<BigInteger>> out = new ArrayList<>();
    for (int r = 0; r < n; r++) {
      List<BigInteger> row = new ArrayList<>();
      for (int c = 0; c <= r; c++)
        row.add(
            c == 0 || c == r
                ? BigInteger.ONE
                : out.get(r - 1).get(c - 1).add(out.get(r - 1).get(c)));
      out.add(row);
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(4));
  }
}
