import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static long power(long x,long n){ long ans=1,mod=1000000007L; while(n>0){ if((n&1)==1) ans=ans*x%mod; x=x*x%mod; n>>=1; } return ans; }
    public static long solve(long n){ if(n<0) throw new IllegalArgumentException(); return power(5,n/2+n%2)*power(4,n/2)%1000000007L; }

    public static void main(String[] args) {
        System.out.println(solve(4));
    }
}
