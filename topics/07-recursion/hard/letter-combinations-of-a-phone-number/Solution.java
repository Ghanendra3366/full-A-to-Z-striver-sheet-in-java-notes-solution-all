import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static final String[] MAP={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static void dfs(String digits,int i,StringBuilder p,List<String> out){ if(i==digits.length()){ out.add(p.toString()); return; } char digit=digits.charAt(i); if(digit<'2'||digit>'9') throw new IllegalArgumentException(); for(char c:MAP[digit-'0'].toCharArray()){ p.append(c); dfs(digits,i+1,p,out); p.deleteCharAt(p.length()-1); } }
    public static List<String> solve(String digits){ List<String> out=new ArrayList<>(); if(!digits.isEmpty()) dfs(digits,0,new StringBuilder(),out); return out; }

    public static void main(String[] args) {
        System.out.println(solve("23"));
    }
}
