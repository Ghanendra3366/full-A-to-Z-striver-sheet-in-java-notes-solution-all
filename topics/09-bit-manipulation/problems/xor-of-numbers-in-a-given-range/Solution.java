import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static int prefix(int n){ switch(n&3){ case 0:return n; case 1:return 1; case 2:return n+1; default:return 0; } }
    public static int solve(int l,int r){ if(l<0||r<l) throw new IllegalArgumentException(); return prefix(r)^(l==0?0:prefix(l-1)); }

    public static void main(String[] args) {
        System.out.println(solve(3,9));
    }
}
