import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static Map<Integer,Integer> frequencies(int[] a) {
        Map<Integer,Integer> map = new TreeMap<>();
        for (int x : a) map.put(x, map.getOrDefault(x,0)+1);
        return map;
    }
    public static int solve(int[] a) {
        if (a.length == 0) throw new IllegalArgumentException("nonempty array required");
        int best = 0, count = -1;
        for (Map.Entry<Integer,Integer> e : frequencies(a).entrySet())
            if (e.getValue() > count) { best=e.getKey(); count=e.getValue(); }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{3,2,3,2,1}));
    }
}
