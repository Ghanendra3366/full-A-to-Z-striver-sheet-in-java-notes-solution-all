import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int l,int r){
        if(l<0||r<l) throw new IllegalArgumentException(); if((long)r-l+1>10000000) throw new IllegalArgumentException("segment too large");
        int root=(int)Math.sqrt(r); while((long)(root+1)*(root+1)<=r) root++;
        boolean[] base=new boolean[root+1]; Arrays.fill(base,true); if(root>=0) base[0]=false; if(root>=1) base[1]=false;
        for(int p=2;p<=root/p;p++) if(base[p]) for(int j=p*p;j<=root;j+=p) base[j]=false;
        boolean[] composite=new boolean[r-l+1];
        for(int p=2;p<=root;p++) if(base[p]){ long start=Math.max((long)p*p,((long)l+p-1)/p*p); for(long x=start;x<=r;x+=p) composite[(int)(x-l)]=true; }
        int count=0; for(int i=0;i<composite.length;i++) if((long)l+i>=2 && !composite[i]) count++; return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(10,20));
    }
}
