import java.util.*;

public class Solution {
  public static List<Integer> solve(int n) {
    if (n < 1) throw new IllegalArgumentException();
    List<Integer> out = new ArrayList<>();
    for (int p = 2; p <= n / p; p++)
      while (n % p == 0) {
        out.add(p);
        n /= p;
      }
    if (n > 1) out.add(n);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(360));
  }
}
