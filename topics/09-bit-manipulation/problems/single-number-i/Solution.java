import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int[] a){ int ans=0; for(int x:a) ans^=x; return ans; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{4,1,2,1,2}));
    }
}
