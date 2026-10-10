import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static void solve(int[] a,int[] b){
        int total=a.length+b.length;
        for(int gap=(total+1)/2;gap>0;gap=gap==1?0:(gap+1)/2){
            for(int i=0,j=gap;j<total;i++,j++){ int x=i<a.length?a[i]:b[i-a.length],y=j<a.length?a[j]:b[j-a.length];
                if(x>y){ if(i<a.length) a[i]=y; else b[i-a.length]=y; if(j<a.length) a[j]=x; else b[j-a.length]=x; }
            }
        }
    }

    public static void main(String[] args) {
        int[] a={1,4,8},b={2,3,9}; solve(a,b); System.out.println(Arrays.toString(a)); System.out.println(Arrays.toString(b));
    }
}
