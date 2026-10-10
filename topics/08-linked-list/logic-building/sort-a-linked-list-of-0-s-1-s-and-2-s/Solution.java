import java.util.*;
import java.math.BigInteger;

public class Solution {
    static class Node { int value; Node next,prev,random,bottom; Node(int v){value=v;} }
    static Node list(int... values){ Node dummy=new Node(0),tail=dummy; for(int v:values){ tail.next=new Node(v); tail.next.prev=tail==dummy?null:tail; tail=tail.next; } return dummy.next; }
    static String view(Node head){ List<Integer> a=new ArrayList<>(); for(Node n=head;n!=null;n=n.next) a.add(n.value); return a.toString(); }
    public static Node solve(Node h){ int[] count=new int[3]; for(Node p=h;p!=null;p=p.next){ if(p.value<0||p.value>2) throw new IllegalArgumentException(); count[p.value]++; } Node p=h; for(int x=0;x<3;x++) while(count[x]-->0){ p.value=x; p=p.next; } return h; }

    public static void main(String[] args) {
        System.out.println(view(solve(list(2,0,1,2,0))));
    }
}
