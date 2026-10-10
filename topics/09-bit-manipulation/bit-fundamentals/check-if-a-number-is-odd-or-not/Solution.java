import java.util.*;

public class Solution {
  public static boolean solve(int n) {
    return (n & 1) != 0;
  }

  public static void main(String[] args) {
    System.out.println(solve(-3));
  }
}
