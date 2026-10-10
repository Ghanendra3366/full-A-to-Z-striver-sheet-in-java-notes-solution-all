import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[] solve(int[] a,int target){ Map<Long,Integer> seen=new HashMap<>(); for(int i=0;i<a.length;i++){ Integer j=seen.get((long)target-a[i]); if(j!=null) return new int[]{j,i}; seen.put((long)a[i],i); } return new int[]{-1,-1}; }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{2,7,11,15},9)));
    }
}
