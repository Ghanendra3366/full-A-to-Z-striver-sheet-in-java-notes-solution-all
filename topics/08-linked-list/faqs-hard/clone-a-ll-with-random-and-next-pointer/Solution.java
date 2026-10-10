import java.util.*;
import java.math.BigInteger;

public class Solution {
    static class Node { int value; Node next,prev,random,bottom; Node(int v){value=v;} }
    static Node list(int... values){ Node dummy=new Node(0),tail=dummy; for(int v:values){ tail.next=new Node(v); tail.next.prev=tail==dummy?null:tail; tail=tail.next; } return dummy.next; }
    static String view(Node head){ List<Integer> a=new ArrayList<>(); for(Node n=head;n!=null;n=n.next) a.add(n.value); return a.toString(); }
    public static Node solve(Node h){ if(h==null) return null; for(Node p=h;p!=null;){ Node next=p.next,copy=new Node(p.value); p.next=copy; copy.next=next; p=next; } for(Node p=h;p!=null;p=p.next.next) p.next.random=p.random==null?null:p.random.next; Node result=h.next; for(Node p=h;p!=null;){ Node copy=p.next,next=copy.next; p.next=next; copy.next=next==null?null:next.next; p=next; } return result; }

    public static void main(String[] args) {
        Node h=list(1,2); h.random=h.next; h.next.random=h; Node copy=solve(h); System.out.println(view(copy)); System.out.println(copy!=h && copy.random==copy.next && h.next.value==2);
    }
}
