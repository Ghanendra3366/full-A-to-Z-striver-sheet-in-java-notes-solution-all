import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static long solve(int[] a,long k){ Map<Long,Long> count=new HashMap<>(); count.put(0L,1L); long prefix=0; long ans=0; for(int x:a){ prefix+=x; ans+=count.getOrDefault(prefix-k,0L); count.put(prefix,count.getOrDefault(prefix,0L)+1); } return ans; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,1},2));
    }
}
