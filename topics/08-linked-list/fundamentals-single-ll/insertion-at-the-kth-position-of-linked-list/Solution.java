import java.util.*;
import java.math.BigInteger;

public class Solution {
    static class Node { int value; Node next,prev,random,bottom; Node(int v){value=v;} }
    static Node list(int... values){ Node dummy=new Node(0),tail=dummy; for(int v:values){ tail.next=new Node(v); tail.next.prev=tail==dummy?null:tail; tail=tail.next; } return dummy.next; }
    static String view(Node head){ List<Integer> a=new ArrayList<>(); for(Node n=head;n!=null;n=n.next) a.add(n.value); return a.toString(); }
    public static Node solve(Node h,int k,int value){ if(k<1) throw new IllegalArgumentException(); Node dummy=new Node(0); dummy.next=h; Node p=dummy; for(int i=1;i<k;i++){ if(p.next==null) throw new IllegalArgumentException("position beyond length+1"); p=p.next; } Node n=new Node(value); n.next=p.next; p.next=n; return dummy.next; }

    public static void main(String[] args) {
        System.out.println(view(solve(list(1,3),2,2)));
    }
}
