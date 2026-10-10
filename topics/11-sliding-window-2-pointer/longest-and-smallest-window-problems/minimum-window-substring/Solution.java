import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static String solve(String s,String t){ if(t.isEmpty()) return ""; int[] need=new int[65536]; for(char c:t.toCharArray()) need[c]++; int missing=t.length(),l=0,start=0,best=Integer.MAX_VALUE; for(int r=0;r<s.length();r++){ if(need[s.charAt(r)]-->0) missing--; while(missing==0){ if(r-l+1<best){ best=r-l+1; start=l; } if(++need[s.charAt(l++)]>0) missing++; } } return best==Integer.MAX_VALUE?"":s.substring(start,start+best); }

    public static void main(String[] args) {
        System.out.println(solve("ADOBECODEBANC","ABC"));
    }
}
