import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[][] solve(int[][] a){ int n=a.length; for(int[] row:a) if(row.length!=n) throw new IllegalArgumentException("square matrix required"); for(int r=0;r<n;r++) for(int c=r+1;c<n;c++){ int t=a[r][c]; a[r][c]=a[c][r]; a[c][r]=t; } for(int[] row:a) for(int l=0,h=n-1;l<h;l++,h--){ int t=row[l]; row[l]=row[h]; row[h]=t; } return a; }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solve(new int[][]{{1,2},{3,4}})));
    }
}
