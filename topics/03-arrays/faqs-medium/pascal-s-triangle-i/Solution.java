import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static BigInteger choose(int n,int r){
        if(n<0 || r<0 || r>n) throw new IllegalArgumentException(); r=Math.min(r,n-r); BigInteger v=BigInteger.ONE;
        for(int i=1;i<=r;i++) v=v.multiply(BigInteger.valueOf(n-r+i)).divide(BigInteger.valueOf(i)); return v;
    }
    public static BigInteger solve(int row,int col){ return choose(row-1,col-1); }

    public static void main(String[] args) {
        System.out.println(solve(5,3));
    }
}
