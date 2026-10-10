import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static int compare(long x,int power,int value){ long product=1; for(int i=0;i<power;i++){ if(x!=0 && product>value/x) return 1; product*=x; } return Long.compare(product,value); }
    public static int solve(int power,int value){ if(power<=0||value<0) throw new IllegalArgumentException(); if(value==0) return 0; int l=1,r=value; while(l<=r){ int m=l+(r-l)/2,c=compare(m,power,value); if(c==0) return m; if(c<0){ if(m==Integer.MAX_VALUE) break; l=m+1; } else r=m-1; } return -1; }

    public static void main(String[] args) {
        System.out.println(solve(3,27));
    }
}
