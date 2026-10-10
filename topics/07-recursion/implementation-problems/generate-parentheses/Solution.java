import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static void dfs(int n,int open,int close,StringBuilder path,List<String> out){ if(close==n){ out.add(path.toString()); return; } if(open<n){ path.append('('); dfs(n,open+1,close,path,out); path.deleteCharAt(path.length()-1); } if(close<open){ path.append(')'); dfs(n,open,close+1,path,out); path.deleteCharAt(path.length()-1); } }
    public static List<String> solve(int n){ if(n<0) throw new IllegalArgumentException(); List<String> out=new ArrayList<>(); dfs(n,0,0,new StringBuilder(),out); return out; }

    public static void main(String[] args) {
        System.out.println(solve(3));
    }
}
