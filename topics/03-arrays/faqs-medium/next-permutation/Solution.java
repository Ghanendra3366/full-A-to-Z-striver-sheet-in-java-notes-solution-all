import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[] solve(int[] a){ int i=a.length-2; while(i>=0 && a[i]>=a[i+1]) i--; if(i>=0){ int j=a.length-1; while(a[j]<=a[i]) j--; int t=a[i]; a[i]=a[j]; a[j]=t; } for(int l=i+1,r=a.length-1;l<r;l++,r--){ int t=a[l]; a[l]=a[r]; a[r]=t; } return a; }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,2,3})));
    }
}
