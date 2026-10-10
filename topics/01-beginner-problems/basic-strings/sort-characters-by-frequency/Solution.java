import java.util.*;

public class Solution {
  public static String solve(String s) {
    Map<Character, Integer> f = new HashMap<>();
    for (char c : s.toCharArray()) f.put(c, f.getOrDefault(c, 0) + 1);
    List<Character> keys = new ArrayList<>(f.keySet());
    keys.sort(
        (a, b) -> {
          int cmp = Integer.compare(f.get(b), f.get(a));
          return cmp != 0 ? cmp : Character.compare(a, b);
        });
    StringBuilder out = new StringBuilder();
    for (char c : keys) for (int i = 0; i < f.get(c); i++) out.append(c);
    return out.toString();
  }

  public static void main(String[] args) {
    System.out.println(solve("tree"));
  }
}
