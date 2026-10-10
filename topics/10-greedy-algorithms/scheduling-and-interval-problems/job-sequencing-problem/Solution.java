import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static long[] solve(int[][] jobs){ int[][] a=jobs.clone(); Arrays.sort(a,(x,y)->Integer.compare(y[1],x[1])); int max=0; for(int[] j:a) max=Math.max(max,j[0]); int[] slot=new int[Math.min(max,a.length)+1]; Arrays.fill(slot,-1); long profit=0,count=0; for(int[] j:a){ if(j[1]<=0) continue; for(int t=Math.min(j[0],slot.length-1);t>=1;t--) if(slot[t]==-1){ slot[t]=1; count++; profit+=j[1]; break; } } return new long[]{count,profit}; }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[][]{{2,100},{1,19},{2,27},{1,25},{3,15}})));
    }
}
