import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static BigInteger choose(int n,int r){
        if(n<0 || r<0 || r>n) throw new IllegalArgumentException(); r=Math.min(r,n-r); BigInteger v=BigInteger.ONE;
        for(int i=1;i<=r;i++) v=v.multiply(BigInteger.valueOf(n-r+i)).divide(BigInteger.valueOf(i)); return v;
    }
    public static List<BigInteger> solve(int row){ if(row<1) throw new IllegalArgumentException(); List<BigInteger> out=new ArrayList<>(); BigInteger v=BigInteger.ONE; for(int c=0;c<row;c++){ out.add(v); v=v.multiply(BigInteger.valueOf(row-1-c)).divide(BigInteger.valueOf(c+1)); } return out; }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}
