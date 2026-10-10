import java.util.*;

public class Solution {
  static class LRUCache {
    final int capacity;
    final LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(16, 0.75f, true);

    LRUCache(int capacity) {
      if (capacity < 0) throw new IllegalArgumentException();
      this.capacity = capacity;
    }

    OptionalInt get(int key) {
      Integer value = map.get(key);
      return value == null ? OptionalInt.empty() : OptionalInt.of(value);
    }

    void put(int key, int value) {
      if (capacity == 0) return;
      map.put(key, value);
      if (map.size() > capacity) {
        Iterator<Integer> it = map.keySet().iterator();
        it.next();
        it.remove();
      }
    }
  }

  public static void main(String[] args) {
    LRUCache c = new LRUCache(2);
    c.put(1, 10);
    c.put(2, 20);
    c.get(1);
    c.put(3, 30);
    System.out.println(c.get(2).isPresent());
    System.out.println(c.get(1).getAsInt());
  }
}
