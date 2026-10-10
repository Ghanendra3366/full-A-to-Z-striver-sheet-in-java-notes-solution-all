import java.util.*;

public class Solution {
  public static long solve(char[] tasks, int cooldown) {
    if (cooldown < 0) throw new IllegalArgumentException();
    int[] count = new int[26];
    for (char c : tasks) {
      if (c < 'A' || c > 'Z') throw new IllegalArgumentException();
      count[c - 'A']++;
    }
    int max = 0, ties = 0;
    for (int f : count) max = Math.max(max, f);
    for (int f : count) if (f == max && f > 0) ties++;
    return Math.max(tasks.length, (long) (max - 1) * (cooldown + 1L) + ties);
  }

  public static void main(String[] args) {
    System.out.println(solve(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 2));
  }
}
