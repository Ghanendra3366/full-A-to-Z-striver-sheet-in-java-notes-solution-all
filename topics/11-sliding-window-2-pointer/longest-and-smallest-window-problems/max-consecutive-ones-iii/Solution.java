import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int[] a,int k){ if(k<0) throw new IllegalArgumentException(); int l=0,zeros=0,best=0; for(int r=0;r<a.length;r++){ if(a[r]==0) zeros++; while(zeros>k) if(a[l++]==0) zeros--; best=Math.max(best,r-l+1); } return best; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
}
