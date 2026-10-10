import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int solve(int n){ int count=0; while(n!=0){ n &= n-1; count++; } return count; }

    public static void main(String[] args) {
        System.out.println(solve(-1));
    }
}
