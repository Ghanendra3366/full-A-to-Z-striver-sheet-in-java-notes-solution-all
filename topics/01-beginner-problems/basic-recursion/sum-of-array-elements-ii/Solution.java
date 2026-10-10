import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static long solve(int[] a, int i) { return i==a.length?0:a[i]+solve(a,i+1); }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3},0));
    }
}
