import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static double solve(double x,int exponent){ long n=exponent; if(n<0){ x=1/x; n=-n; } double ans=1; while(n>0){ if((n&1)==1) ans*=x; x*=x; n>>=1; } return ans; }

    public static void main(String[] args) {
        System.out.println(solve(2,-3));
    }
}
