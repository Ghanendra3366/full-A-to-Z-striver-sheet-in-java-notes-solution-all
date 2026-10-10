import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static long atMost(String s,int k){ if(k<0) return 0; Map<Character,Integer> count=new HashMap<>(); int l=0; long ans=0; for(int r=0;r<s.length();r++){ char c=s.charAt(r); count.put(c,count.getOrDefault(c,0)+1); while(count.size()>k){ char x=s.charAt(l++); int f=count.get(x)-1; if(f==0) count.remove(x); else count.put(x,f); } ans+=r-l+1; } return ans; }
    public static long solve(String s,int k){ return atMost(s,k)-atMost(s,k-1); }

    public static void main(String[] args) {
        System.out.println(solve("pqpqs",2));
    }
}
