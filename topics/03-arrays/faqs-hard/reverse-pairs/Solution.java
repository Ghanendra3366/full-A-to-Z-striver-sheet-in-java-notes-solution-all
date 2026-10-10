import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static long count(int[] a,int[] tmp,int l,int r,boolean reverse){
        if(r-l<2) return 0; int m=l+(r-l)/2; long ans=count(a,tmp,l,m,reverse)+count(a,tmp,m,r,reverse);
        int j=m; for(int i=l;i<m;i++){ while(j<r && (reverse?(long)a[i]>2L*a[j]:a[i]>a[j])) j++; ans+=j-m; }
        int i=l,k=l; j=m; while(i<m && j<r) tmp[k++]=a[i]<=a[j]?a[i++]:a[j++];
        while(i<m) tmp[k++]=a[i++]; while(j<r) tmp[k++]=a[j++]; System.arraycopy(tmp,l,a,l,r-l); return ans;
    }
    public static long solve(int[] input){ int[] a=input.clone(); return count(a,new int[a.length],0,a.length,true); }
    public static long brute(int[] a){ long ans=0; for(int i=0;i<a.length;i++) for(int j=i+1;j<a.length;j++) if((long)a[i]>2L*a[j]) ans++; return ans; }
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,4,3,5,1}));
    }
}
