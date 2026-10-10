import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static long solve(int n) { if(n<0) throw new IllegalArgumentException(); return n==0?0:n+solve(n-1); }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}
