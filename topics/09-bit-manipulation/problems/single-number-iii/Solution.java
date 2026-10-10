import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[] solve(int[] a){ int xor=0; for(int x:a) xor^=x; int bit=xor&-xor,p=0,q=0; for(int x:a) if((x&bit)==0) p^=x; else q^=x; return p<q?new int[]{p,q}:new int[]{q,p}; }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,2,1,3,2,5})));
    }
}
