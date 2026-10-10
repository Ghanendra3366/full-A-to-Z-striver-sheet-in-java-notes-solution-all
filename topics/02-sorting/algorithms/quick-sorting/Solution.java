import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[] solve(int[] a) { quick(a,0,a.length-1,new Random(0)); return a; }
    private static void quick(int[] a,int l,int r,Random random) {
        if(l>=r) return;
        int pick=l+random.nextInt(r-l+1), t=a[pick]; a[pick]=a[r]; a[r]=t;
        int pivot=a[r],i=l;
        for(int j=l;j<r;j++) if(a[j]<pivot){ t=a[i]; a[i]=a[j]; a[j]=t; i++; }
        t=a[i]; a[i]=a[r]; a[r]=t;
        quick(a,l,i-1,random); quick(a,i+1,r,random);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{5,-1,2,2,0})));
    }
}
