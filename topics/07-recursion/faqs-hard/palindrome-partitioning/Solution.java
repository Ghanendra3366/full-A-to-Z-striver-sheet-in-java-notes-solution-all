import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static boolean palindrome(String s,int l,int r){ while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false; return true; }
    private static void dfs(String s,int start,List<String> p,List<List<String>> out){ if(start==s.length()){ out.add(new ArrayList<>(p)); return; } for(int end=start;end<s.length();end++) if(palindrome(s,start,end)){ p.add(s.substring(start,end+1)); dfs(s,end+1,p,out); p.remove(p.size()-1); } }
    public static List<List<String>> solve(String s){ List<List<String>> out=new ArrayList<>(); dfs(s,0,new ArrayList<>(),out); return out; }

    public static void main(String[] args) {
        System.out.println(solve("aab"));
    }
}
