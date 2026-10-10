import java.util.*;

public class Solution {
  public static int[] solve(int[] a) {
    Deque<Integer> stack = new ArrayDeque<>();
    for (int x : a) {
      if (x == 0) throw new IllegalArgumentException();
      boolean alive = true;
      while (alive && x < 0 && !stack.isEmpty() && stack.peek() > 0) {
        long size = -(long) x;
        if (stack.peek() < size) stack.pop();
        else {
          if (stack.peek() == size) stack.pop();
          alive = false;
        }
      }
      if (alive) stack.push(x);
    }
    int[] out = new int[stack.size()];
    for (int i = out.length - 1; i >= 0; i--) out[i] = stack.pop();
    return out;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[] {5, 10, -5})));
  }
}
