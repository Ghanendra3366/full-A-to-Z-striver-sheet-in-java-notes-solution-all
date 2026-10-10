import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int[] a){ int once=0,twice=0; for(int x:a){ once=(once^x)&~twice; twice=(twice^x)&~once; } return once; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,2,3,2}));
    }
}
