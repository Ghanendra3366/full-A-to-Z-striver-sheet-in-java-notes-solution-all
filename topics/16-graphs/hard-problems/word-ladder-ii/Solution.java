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

  static void paths(
      String current,
      String begin,
      Set<String> words,
      Map<String, Integer> d,
      List<String> reversed,
      List<List<String>> out) {
    reversed.add(current);
    if (current.equals(begin)) {
      List<String> path = new ArrayList<>(reversed);
      Collections.reverse(path);
      out.add(path);
    } else
      for (String before : neighbors(current, words))
        if (d.containsKey(before) && d.get(before) == d.get(current) - 1)
          paths(before, begin, words, d, reversed, out);
    reversed.remove(reversed.size() - 1);
  }

  public static List<List<String>> solve(String begin, String end, String[] dictionary) {
    Set<String> words = new HashSet<>(Arrays.asList(dictionary));
    List<List<String>> out = new ArrayList<>();
    if (!begin.equals(end) && !words.contains(end)) return out;
    Map<String, Integer> d = wordDistances(begin, words);
    if (!d.containsKey(end)) return out;
    words.add(begin);
    paths(end, begin, words, d, new ArrayList<>(), out);
    out.sort((a, b) -> a.toString().compareTo(b.toString()));
    return out;
  }

  public static void main(String[] args) {
    System.out.println(
        solve("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"}));
  }
}
