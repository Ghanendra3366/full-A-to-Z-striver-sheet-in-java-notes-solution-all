import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static List<List<Integer>> solve(int[] input){
        int[] a=input.clone(); Arrays.sort(a); List<List<Integer>> out=new ArrayList<>();
        for(int i=0;i<a.length-2;i++){ if(i>0 && a[i]==a[i-1]) continue; int l=i+1,r=a.length-1;
            while(l<r){ long sum=(long)a[i]+a[l]+a[r]; if(sum<0) l++; else if(sum>0) r--; else { out.add(Arrays.asList(a[i],a[l],a[r])); int x=a[l],y=a[r]; while(l<r && a[l]==x) l++; while(l<r && a[r]==y) r--; } }
        } return out;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{-1,0,1,2,-1,-4}));
    }
}
