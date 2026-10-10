import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static long solve(int[] a,int k){ if(k<0||k>a.length) throw new IllegalArgumentException(); long score=0; for(int i=0;i<k;i++) score+=a[i]; long best=score; for(int takenRight=1;takenRight<=k;takenRight++){ score-=a[k-takenRight]; score+=a[a.length-takenRight]; best=Math.max(best,score); } return best; }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3,4,5,6,1},3));
    }
}
