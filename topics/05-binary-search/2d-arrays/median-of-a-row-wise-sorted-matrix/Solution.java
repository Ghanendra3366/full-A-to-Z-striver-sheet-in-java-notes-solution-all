import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int[][] a){ if(a.length==0||a[0].length==0) throw new IllegalArgumentException(); int n=a[0].length; long total=(long)a.length*n; if(total%2==0) throw new IllegalArgumentException("odd cell count required"); long l=Integer.MAX_VALUE,r=Integer.MIN_VALUE; for(int[] row:a){ l=Math.min(l,row[0]); r=Math.max(r,row[n-1]); } while(l<r){ long mid=l+(r-l)/2,count=0; for(int[] row:a){ int lo=0,hi=n; while(lo<hi){ int m=lo+(hi-lo)/2; if(row[m]<=mid) lo=m+1; else hi=m; } count+=lo; } if(count>total/2) r=mid; else l=mid+1; } return (int)l; }

    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1,3,5},{2,6,9},{3,6,9}}));
    }
}
