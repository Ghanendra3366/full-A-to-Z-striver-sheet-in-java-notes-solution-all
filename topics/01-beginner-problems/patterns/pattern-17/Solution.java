import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static String solve(int n) {
        if(n<0) throw new IllegalArgumentException("nonnegative n required");
        StringBuilder out=new StringBuilder();
        for(int r=1;r<=n;r++){ for(int c=0;c<n-r;c++) out.append(" "); for(int c=0;c<2*r-1;c++) out.append((char)('A'+Math.min(c,2*r-2-c))); out.append("\n"); }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.print(solve(3));
    }
}
