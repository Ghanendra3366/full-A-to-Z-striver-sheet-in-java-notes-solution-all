import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static String solve(String s){ char[] a=s.toCharArray(); for(int l=0,r=a.length-1;l<r;l++,r--){ char t=a[l]; a[l]=a[r]; a[r]=t; } return new String(a); }

    public static void main(String[] args) {
        System.out.println(solve("java"));
    }
}
