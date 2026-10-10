import java.util.*;
import java.math.BigInteger;

public class Solution {
    static class Node { int value; Node next,prev,random,bottom; Node(int v){value=v;} }
    static Node list(int... values){ Node dummy=new Node(0),tail=dummy; for(int v:values){ tail.next=new Node(v); tail.next.prev=tail==dummy?null:tail; tail=tail.next; } return dummy.next; }
    static String view(Node head){ List<Integer> a=new ArrayList<>(); for(Node n=head;n!=null;n=n.next) a.add(n.value); return a.toString(); }
    public static Node reverse(Node h){ Node previous=null; while(h!=null){ Node next=h.next; h.next=previous; previous=h; h=next; } return previous; }
    public static boolean solve(Node h){ if(h==null||h.next==null) return true; Node slow=h,fast=h; while(fast.next!=null&&fast.next.next!=null){ slow=slow.next; fast=fast.next.next; } Node second=reverse(slow.next),a=h,b=second; boolean ok=true; while(b!=null){ if(a.value!=b.value) ok=false; a=a.next; b=b.next; } slow.next=reverse(second); return ok; }

    public static void main(String[] args) {
        System.out.println(solve(list(1,2,2,1)));
    }
}
