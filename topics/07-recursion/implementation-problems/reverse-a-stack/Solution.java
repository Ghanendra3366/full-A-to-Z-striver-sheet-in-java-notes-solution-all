import java.util.*;
import java.math.BigInteger;

public class Solution {
    private static void bottom(Deque<Integer> stack,int x){ if(stack.isEmpty()){ stack.push(x); return; } int y=stack.pop(); bottom(stack,x); stack.push(y); }
    public static void solve(Deque<Integer> stack){ if(stack.isEmpty()) return; int x=stack.pop(); solve(stack); bottom(stack,x); }

    public static void main(String[] args) {
        Deque<Integer> s=new ArrayDeque<>(Arrays.asList(1,2,3)); solve(s); System.out.println(s);
    }
}
