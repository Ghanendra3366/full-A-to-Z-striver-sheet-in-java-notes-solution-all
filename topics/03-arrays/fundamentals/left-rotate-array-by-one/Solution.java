import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[] solve(int[] a){ if(a.length==0) return a; int first=a[0]; for(int i=1;i<a.length;i++) a[i-1]=a[i]; a[a.length-1]=first; return a; }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,2,3})));
    }
}
