import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static boolean solve(String s,String goal){ return s.length()==goal.length() && (s+s).contains(goal); }

    public static void main(String[] args) {
        System.out.println(solve("abcde","cdeab"));
    }
}
