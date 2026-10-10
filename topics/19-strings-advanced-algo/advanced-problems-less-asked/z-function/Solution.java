import java.util.*;

public class Solution {
  public static int[] solve(String s) {
    int[] z = new int[s.length()];
    int l = 0, r = 0;
    for (int i = 1; i < s.length(); i++) {
      if (i <= r) z[i] = Math.min(r - i + 1, z[i - l]);
      while (i + z[i] < s.length() && s.charAt(z[i]) == s.charAt(i + z[i])) z[i]++;
      if (i + z[i] - 1 > r) {
        l = i;
        r = i + z[i] - 1;
      }
    }
    return z;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve("aaaaa")));
  }
}
