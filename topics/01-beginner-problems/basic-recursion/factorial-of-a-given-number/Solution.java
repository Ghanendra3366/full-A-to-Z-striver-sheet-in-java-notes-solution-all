import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static BigInteger solve(int n) { if(n<0) throw new IllegalArgumentException(); return n<=1?BigInteger.ONE:BigInteger.valueOf(n).multiply(solve(n-1)); }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}
