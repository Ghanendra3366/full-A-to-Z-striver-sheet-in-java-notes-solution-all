import java.util.*;

public class Solution {
  public static boolean[] sieve(int n) {
    if (n < 0) throw new IllegalArgumentException("n must be nonnegative");
    boolean[] prime = new boolean[n + 1];
    Arrays.fill(prime, true);
    prime[0] = false;
    if (n >= 1) prime[1] = false;
    for (int p = 2; p <= n / p; p++)
      if (prime[p]) for (long j = (long) p * p; j <= n; j += p) prime[(int) j] = false;
    return prime;
  }

  public static int solve(int n) {
    boolean[] p = sieve(n);
    int count = 0;
    for (boolean x : p) if (x) count++;
    return count;
  }

  public static List<Integer> primes(int n) {
    boolean[] p = sieve(n);
    List<Integer> out = new ArrayList<>();
    for (int i = 2; i < p.length; i++) if (p[i]) out.add(i);
    return out;
  }

  public static void main(String[] args) {
    System.out.println(primes(20));
  }
}
