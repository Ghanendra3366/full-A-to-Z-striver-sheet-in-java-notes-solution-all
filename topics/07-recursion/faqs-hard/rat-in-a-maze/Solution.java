import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static final int[] DR={1,0,0,-1},DC={0,-1,1,0}; private static final char[] DIR={'D','L','R','U'};
    private static void dfs(int[][] a,int r,int c,boolean[][] seen,StringBuilder p,List<String> out){ int n=a.length; if(r==n-1&&c==n-1){ out.add(p.toString()); return; } seen[r][c]=true; for(int d=0;d<4;d++){ int x=r+DR[d],y=c+DC[d]; if(x>=0&&y>=0&&x<n&&y<n&&a[x][y]==1&&!seen[x][y]){ p.append(DIR[d]); dfs(a,x,y,seen,p,out); p.deleteCharAt(p.length()-1); } } seen[r][c]=false; }
    public static List<String> solve(int[][] a){ List<String> out=new ArrayList<>(); int n=a.length; if(n==0) return out; for(int[] row:a) if(row.length!=n) throw new IllegalArgumentException(); if(a[0][0]==1&&a[n-1][n-1]==1) dfs(a,0,0,new boolean[n][n],new StringBuilder(),out); return out; }

    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1,0},{1,1}}));
    }
}
