import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static void dfs(int[] a,int i,List<Integer> path,List<List<Integer>> out){ if(i==a.length){ out.add(new ArrayList<>(path)); return; } dfs(a,i+1,path,out); path.add(a[i]); dfs(a,i+1,path,out); path.remove(path.size()-1); }
    public static List<List<Integer>> solve(int[] a){ List<List<Integer>> out=new ArrayList<>(); dfs(a,0,new ArrayList<>(),out); return out; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2}));
    }
}
