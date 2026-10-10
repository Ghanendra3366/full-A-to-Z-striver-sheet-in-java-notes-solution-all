import java.util.*;

public class Solution {
  public static String solve(String s) {
    String[] words = s.trim().split("\\s+");
    StringBuilder out = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
      if (words[i].isEmpty()) continue;
      if (out.length() > 0) out.append(' ');
      out.append(words[i]);
    }
    return out.toString();
  }

  public static void main(String[] args) {
    System.out.println(solve("  the sky   is blue  "));
  }
}
