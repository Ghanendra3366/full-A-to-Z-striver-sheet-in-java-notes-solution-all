import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static BigInteger solve(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be nonnegative");
        BigInteger ans = BigInteger.ONE;
        for (int i = 2; i <= n; i++) ans = ans.multiply(BigInteger.valueOf(i));
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve(20));
    }
}
