import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int[] a){ if(a.length==0) return -1; long end=0,far=0; int jumps=0; for(int i=0;i<a.length-1;i++){ if(a[i]<0) throw new IllegalArgumentException(); if(i>far) return -1; far=Math.max(far,(long)i+a[i]); if(i==end){ if(far==end) return -1; jumps++; end=far; if(end>=a.length-1) return jumps; } } return 0; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3,1,1,4}));
    }
}
