import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static boolean solve(String s,String t){ if(s.length()!=t.length()) return false; int[] count=new int[65536]; for(int i=0;i<s.length();i++){ count[s.charAt(i)]++; count[t.charAt(i)]--; } for(int x:count) if(x!=0) return false; return true; }

    public static void main(String[] args) {
        System.out.println(solve("anagram","nagaram"));
    }
}
