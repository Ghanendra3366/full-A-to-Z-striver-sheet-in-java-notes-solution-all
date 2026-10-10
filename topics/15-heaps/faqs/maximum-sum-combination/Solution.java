import java.util.*;

public class Solution {
  static class Pair {
    int i, j;
    long sum;

    Pair(int i, int j, int[] a, int[] b) {
      this.i = i;
      this.j = j;
      sum = (long) a[i] + b[j];
    }
  }

  public static List<Long> solve(int[] aa, int[] bb, int k) {
    if (k < 0 || (long) k > (long) aa.length * bb.length) throw new IllegalArgumentException();
    int[] a = aa.clone(), b = bb.clone();
    Arrays.sort(a);
    Arrays.sort(b);
    List<Long> out = new ArrayList<>();
    if (k == 0) return out;
    PriorityQueue<Pair> q = new PriorityQueue<>((x, y) -> Long.compare(y.sum, x.sum));
    Set<Long> seen = new HashSet<>();
    int i = a.length - 1, j = b.length - 1;
    q.offer(new Pair(i, j, a, b));
    seen.add(((long) i << 32) | (j & 0xffffffffL));
    while (out.size() < k) {
      Pair p = q.poll();
      out.add(p.sum);
      for (int[] index : new int[][] {{p.i - 1, p.j}, {p.i, p.j - 1}})
        if (index[0] >= 0 && index[1] >= 0) {
          long key = ((long) index[0] << 32) | (index[1] & 0xffffffffL);
          if (seen.add(key)) q.offer(new Pair(index[0], index[1], a, b));
        }
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 4, 2, 3}, new int[] {2, 5, 1, 6}, 3));
  }
}
