import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static BigInteger solve(int[] a){
        if(a.length==0) throw new IllegalArgumentException(); BigInteger hi=BigInteger.valueOf(a[0]),lo=hi,best=hi;
        for(int i=1;i<a.length;i++){ BigInteger x=BigInteger.valueOf(a[i]),p=hi.multiply(x),q=lo.multiply(x); hi=x.max(p).max(q); lo=x.min(p).min(q); best=best.max(hi); } return best;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3,-2,4}));
    }
}
