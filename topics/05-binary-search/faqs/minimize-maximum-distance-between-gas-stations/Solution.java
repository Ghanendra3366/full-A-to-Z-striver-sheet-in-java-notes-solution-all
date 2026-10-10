import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static double solve(int[] input,int k){ if(k<0) throw new IllegalArgumentException(); if(input.length<2) return 0; int[] a=input.clone(); Arrays.sort(a); double low=0,high=0; for(int i=1;i<a.length;i++) high=Math.max(high,(double)a[i]-a[i-1]); for(int it=0;it<80;it++){ double mid=(low+high)/2; if(mid==0) break; long need=0; for(int i=1;i<a.length;i++){ double gap=(double)a[i]-a[i-1]; double parts=Math.ceil(gap/mid)-1; if(parts>k-need){ need=(long)k+1; break; } if(parts>0) need+=(long)parts; } if(need<=k) high=mid; else low=mid; } return high; }

    public static void main(String[] args) {
        System.out.printf(Locale.ROOT,"%.6f%n",solve(new int[]{0,10},1));
    }
}
