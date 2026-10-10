import java.util.*;

public class Solution {
  static class StockSpanner {
    final Deque<int[]> stack = new ArrayDeque<>();

    int next(int price) {
      int span = 1;
      while (!stack.isEmpty() && stack.peek()[0] <= price) span += stack.pop()[1];
      stack.push(new int[] {price, span});
      return span;
    }
  }

  public static void main(String[] args) {
    StockSpanner s = new StockSpanner();
    List<Integer> out = new ArrayList<>();
    for (int x : new int[] {100, 80, 60, 70, 60, 75, 85}) out.add(s.next(x));
    System.out.println(out);
  }
}
