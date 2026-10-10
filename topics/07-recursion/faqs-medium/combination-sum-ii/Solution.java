import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static void dfs(int[] a,int start,int remaining,List<Integer> p,List<List<Integer>> out,boolean reuse){ if(remaining==0){ out.add(new ArrayList<>(p)); return; } for(int i=start;i<a.length && a[i]<=remaining;i++){ if(i>start&&a[i]==a[i-1]) continue; p.add(a[i]); dfs(a,reuse?i:i+1,remaining-a[i],p,out,reuse); p.remove(p.size()-1); } }
    public static List<List<Integer>> solve(int[] input,int target){ if(target<0) throw new IllegalArgumentException(); int[] a=input.clone(); for(int x:a) if(x<=0) throw new IllegalArgumentException("positive candidates required"); Arrays.sort(a); List<List<Integer>> out=new ArrayList<>(); dfs(a,0,target,new ArrayList<>(),out,false); return out; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3,6,7},7));
    }
}
