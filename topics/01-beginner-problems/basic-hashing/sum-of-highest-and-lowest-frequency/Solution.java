import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static Map<Integer,Integer> frequencies(int[] a) {
        Map<Integer,Integer> map = new TreeMap<>();
        for (int x : a) map.put(x, map.getOrDefault(x,0)+1);
        return map;
    }
    public static int solve(int[] a) {
        if (a.length==0) return 0;
        int low=Integer.MAX_VALUE, high=0;
        for (int f : frequencies(a).values()) { low=Math.min(low,f); high=Math.max(high,f); }
        return low+high;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,2,2,2,3}));
    }
}
