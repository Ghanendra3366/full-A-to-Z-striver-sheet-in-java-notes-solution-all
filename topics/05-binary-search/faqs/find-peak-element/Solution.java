import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int[] a){ if(a.length==0) return -1; int l=0,r=a.length-1; while(l<r){ int m=l+(r-l)/2; if(a[m]<a[m+1]) l=m+1; else r=m; } return l; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3,1}));
    }
}
