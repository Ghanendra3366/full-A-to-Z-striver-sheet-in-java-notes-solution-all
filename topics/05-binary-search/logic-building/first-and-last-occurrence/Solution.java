import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int bound(int[] a,int x,boolean upper){ int l=0,r=a.length; while(l<r){ int m=l+(r-l)/2; if(a[m]<x || upper && a[m]==x) l=m+1; else r=m; } return l; }
    public static int[] solve(int[] a,int x){ int l=bound(a,x,false),r=bound(a,x,true); return l==r?new int[]{-1,-1}:new int[]{l,r-1}; }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,2,2,2,4},2)));
    }
}
