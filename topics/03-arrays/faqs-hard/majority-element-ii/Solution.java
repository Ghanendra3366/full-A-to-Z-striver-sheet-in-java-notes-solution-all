import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static List<Integer> solve(int[] a){
        int x=0,y=1,cx=0,cy=0;
        for(int v:a){ if(v==x) cx++; else if(v==y) cy++; else if(cx==0){ x=v; cx=1; } else if(cy==0){ y=v; cy=1; } else { cx--; cy--; } }
        cx=cy=0; for(int v:a){ if(v==x) cx++; else if(v==y) cy++; }
        List<Integer> out=new ArrayList<>(); if(cx>a.length/3) out.add(x); if(cy>a.length/3) out.add(y); Collections.sort(out); return out;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,1,2,2,2,3}));
    }
}
