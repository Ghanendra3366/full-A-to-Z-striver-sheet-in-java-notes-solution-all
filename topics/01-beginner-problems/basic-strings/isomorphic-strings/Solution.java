import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static boolean solve(String s,String t){ if(s.length()!=t.length()) return false; Map<Character,Character> forward=new HashMap<>(),back=new HashMap<>(); for(int i=0;i<s.length();i++){ char a=s.charAt(i),b=t.charAt(i); if(forward.containsKey(a)&&forward.get(a)!=b || back.containsKey(b)&&back.get(b)!=a) return false; forward.put(a,b); back.put(b,a); } return true; }

    public static void main(String[] args) {
        System.out.println(solve("egg","add"));
    }
}
