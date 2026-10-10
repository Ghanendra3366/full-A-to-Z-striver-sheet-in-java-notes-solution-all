import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int[] a){ int write=0; for(int x:a) if(write==0 || a[write-1]!=x) a[write++]=x; return write; }

    public static void main(String[] args) {
        int[] a={1,1,2,2,3}; int length=solve(a); System.out.println(Arrays.toString(Arrays.copyOf(a,length)));
    }
}
