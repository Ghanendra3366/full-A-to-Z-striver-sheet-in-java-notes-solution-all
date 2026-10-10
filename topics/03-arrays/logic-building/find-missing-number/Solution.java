import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int[] a){ int x=a.length; for(int i=0;i<a.length;i++) x^=i^a[i]; return x; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{3,0,1}));
    }
}
