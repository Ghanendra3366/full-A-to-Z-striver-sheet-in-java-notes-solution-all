import java.math.BigInteger;
import java.util.*;

public class Solution {
  public static BigInteger solve(int[] a) {
    if (a.length == 0) return BigInteger.ZERO;
    int[] length = new int[a.length];
    BigInteger[] count = new BigInteger[a.length];
    Arrays.fill(length, 1);
    Arrays.fill(count, BigInteger.ONE);
    int best = 1;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < i; j++)
        if (a[j] < a[i]) {
          if (length[j] + 1 > length[i]) {
            length[i] = length[j] + 1;
            count[i] = count[j];
          } else if (length[j] + 1 == length[i]) count[i] = count[i].add(count[j]);
        }
      best = Math.max(best, length[i]);
    }
    BigInteger answer = BigInteger.ZERO;
    for (int i = 0; i < a.length; i++) if (length[i] == best) answer = answer.add(count[i]);
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 3, 5, 4, 7}));
  }
}
