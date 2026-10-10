import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int window(int[] a,int k){ if(k<=0) return 0; Map<Integer,Integer> count=new HashMap<>(); int l=0,best=0; for(int r=0;r<a.length;r++){ count.put(a[r],count.getOrDefault(a[r],0)+1); while(count.size()>k){ int x=a[l++],f=count.get(x)-1; if(f==0) count.remove(x); else count.put(x,f); } best=Math.max(best,r-l+1); } return best; }
    public static int solve(int[] a){ return window(a,2); }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,1,2,3}));
    }
}
