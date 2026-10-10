import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static boolean dfs(char[][] a,String word,int i,int r,int c,boolean[][] used){ if(i==word.length()) return true; if(r<0||r==a.length||c<0||c==a[0].length||used[r][c]||a[r][c]!=word.charAt(i)) return false; used[r][c]=true; boolean found=dfs(a,word,i+1,r+1,c,used)||dfs(a,word,i+1,r-1,c,used)||dfs(a,word,i+1,r,c+1,used)||dfs(a,word,i+1,r,c-1,used); used[r][c]=false; return found; }
    public static boolean solve(char[][] a,String word){ if(word.isEmpty()) return true; if(a.length==0||a[0].length==0) return false; boolean[][] used=new boolean[a.length][a[0].length]; for(int r=0;r<a.length;r++) for(int c=0;c<a[0].length;c++) if(dfs(a,word,0,r,c,used)) return true; return false; }

    public static void main(String[] args) {
        System.out.println(solve(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
    }
}
