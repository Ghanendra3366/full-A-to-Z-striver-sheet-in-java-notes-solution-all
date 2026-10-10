import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static boolean solve(int n) {
        if (n < 2) return false;
        for (int d = 2; d <= n / d; d++) if (n % d == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve(97));
    }
}
