import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static long solve(int[] input,int cows){ if(cows<2||cows>input.length) throw new IllegalArgumentException("2<=cows<=n"); int[] a=input.clone(); Arrays.sort(a); long l=0,r=(long)a[a.length-1]-a[0]; while(l<r){ long mid=l+(r-l+1)/2; int placed=1,last=a[0]; for(int i=1;i<a.length;i++) if((long)a[i]-last>=mid){ placed++; last=a[i]; } if(placed>=cows) l=mid; else r=mid-1; } return l; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,8,4,9},3));
    }
}
