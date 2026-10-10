import java.util.*;
import java.math.BigInteger;

public class Solution {
    static class Node { int value; Node next,prev,random,bottom; Node(int v){value=v;} }
    static Node list(int... values){ Node dummy=new Node(0),tail=dummy; for(int v:values){ tail.next=new Node(v); tail.next.prev=tail==dummy?null:tail; tail=tail.next; } return dummy.next; }
    static String view(Node head){ List<Integer> a=new ArrayList<>(); for(Node n=head;n!=null;n=n.next) a.add(n.value); return a.toString(); }
    public static List<List<Integer>> solve(Node h,long target){ List<List<Integer>> out=new ArrayList<>(); if(h==null) return out; Node l=h,r=h; while(r.next!=null) r=r.next; while(l!=r&&l.prev!=r){ long sum=(long)l.value+r.value; if(sum<target) l=l.next; else if(sum>target) r=r.prev; else { out.add(Arrays.asList(l.value,r.value)); int a=l.value,b=r.value; do { l=l.next; } while(l!=null&&l.value==a); do { r=r.prev; } while(r!=null&&r.value==b); if(l==null||r==null) break; } } return out; }

    public static void main(String[] args) {
        System.out.println(solve(list(1,2,3,4,5),6));
    }
}
