import java.util.*;

public class Solution {
  public static List<Integer> solve(int amount) {
    if (amount < 0) throw new IllegalArgumentException();
    int[] coins = {100, 50, 20, 10, 5, 2, 1};
    List<Integer> out = new ArrayList<>();
    for (int coin : coins)
      while (amount >= coin) {
        amount -= coin;
        out.add(coin);
      }
    return out;
  }

  public static void main(String[] args) {
    System.out.println(solve(93));
  }
}
