import java.util.*;

public class Solution {
  public static int solve(int n) {
    return n | (n + 1);
  }

  public static void main(String[] args) {
    System.out.println(solve(10));
  }
}
