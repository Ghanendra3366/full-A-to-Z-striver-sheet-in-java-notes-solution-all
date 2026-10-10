import java.util.*;

public class Solution {
  static List<String> neighbors(String word, Set<String> dictionary) {
    List<String> out = new ArrayList<>();
    char[] a = word.toCharArray();
    for (int i = 0; i < a.length; i++) {
      char old = a[i];
      for (char c = 'a'; c <= 'z'; c++)
        if (c != old) {
          a[i] = c;
          String next = new String(a);
          if (dictionary.contains(next)) out.add(next);
        }
      a[i] = old;
    }
    return out;
  }

  static Map<String, Integer> wordDistances(String begin, Set<String> words) {
    Map<String, Integer> d = new HashMap<>();
    Queue<String> q = new ArrayDeque<>();
    q.offer(begin);
    d.put(begin, 0);
    while (!q.isEmpty()) {
      String w = q.poll();
      for (String next : neighbors(w, words))
        if (!d.containsKey(next)) {
          d.put(next, d.get(w) + 1);
          q.offer(next);
        }
    }
    return d;
  }

  public static int solve(String begin, String end, String[] dictionary) {
    if (begin.equals(end)) return 1;
    Set<String> words = new HashSet<>(Arrays.asList(dictionary));
    if (!words.contains(end)) return 0;
    Integer distance = wordDistances(begin, words).get(end);
    return distance == null ? 0 : distance + 1;
  }

  public static void main(String[] args) {
    System.out.println(
        solve("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"}));
  }
}
