import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    int n = a.length;
    int[] out = new int[n];
    Arrays.fill(out, -1);
    Deque<Integer> stack = new ArrayDeque<>();
    for (int i = n - 1; i >= 0; i--) {
      int x = a[i % n];
      while (!stack.isEmpty() && stack.peek() <= x) stack.pop();
      if (i < n && !stack.isEmpty()) out[i] = stack.peek();
      stack.push(x);
    }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {2, 1, 3})));
  }
}
