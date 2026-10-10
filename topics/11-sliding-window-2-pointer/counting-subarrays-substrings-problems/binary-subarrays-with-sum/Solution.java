import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static long atMost(int[] a,int goal){ if(goal<0) return 0; int l=0; long sum=0,ans=0; for(int r=0;r<a.length;r++){ sum+=a[r]; while(sum>goal) sum-=a[l++]; ans+=r-l+1; } return ans; }
    public static long solve(int[] a,int goal){ return atMost(a,goal)-atMost(a,goal-1); }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,0,1,0,1},2));
    }
}
