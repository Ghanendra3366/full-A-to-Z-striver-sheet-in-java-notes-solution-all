import java.util.*;

public class Solution {
  public static String solve(String s) {
    return s.length() < 2 ? s : solve(s.substring(1)) + s.charAt(0);
  }

  public static void main(String[] args) {
    System.out.println(solve("java"));
  }
}
