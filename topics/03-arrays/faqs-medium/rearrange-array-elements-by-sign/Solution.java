import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[] solve(int[] a){
        List<Integer> pos=new ArrayList<>(),neg=new ArrayList<>(); for(int x:a) if(x>=0) pos.add(x); else neg.add(x);
        int[] out=new int[a.length]; int p=0,q=0,i=0;
        while(p<pos.size() && q<neg.size()){ out[i++]=pos.get(p++); out[i++]=neg.get(q++); }
        while(p<pos.size()) out[i++]=pos.get(p++); while(q<neg.size()) out[i++]=neg.get(q++); return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{3,1,-2,-5,2,-4})));
    }
}
