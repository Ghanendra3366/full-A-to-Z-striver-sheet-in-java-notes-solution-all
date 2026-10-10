import java.util.*;

public class Solution {
  public static int solve(String[] input) {
    String[] a = input.clone();
    Arrays.sort(a, Comparator.comparingInt(String::length));
    Map<String, Integer> best = new HashMap<>();
    int answer = 0;
    for (String s : a) {
      int length = 1;
      for (int i = 0; i < s.length(); i++) {
        String prev = s.substring(0, i) + s.substring(i + 1);
        length = Math.max(length, best.getOrDefault(prev, 0) + 1);
      }
      best.put(s, Math.max(length, best.getOrDefault(s, 0)));
      answer = Math.max(answer, length);
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solve(new String[] {"a", "b", "ba", "bca", "bda", "bdca"}));
  }
}
