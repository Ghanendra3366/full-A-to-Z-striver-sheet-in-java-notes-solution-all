import java.util.*;

public class Solution {
  static class LFUCache {
    static class Entry {
      int value, freq = 1;

      Entry(int v) {
        value = v;
      }
    }

    final int capacity;
    int minimum;
    final Map<Integer, Entry> entries = new HashMap<>();
    final Map<Integer, LinkedHashSet<Integer>> groups = new HashMap<>();

    LFUCache(int capacity) {
      if (capacity < 0) throw new IllegalArgumentException();
      this.capacity = capacity;
    }

    void touch(int key, Entry e) {
      LinkedHashSet<Integer> old = groups.get(e.freq);
      old.remove(key);
      if (old.isEmpty()) {
        groups.remove(e.freq);
        if (minimum == e.freq) minimum++;
      }
      e.freq++;
      groups.computeIfAbsent(e.freq, k -> new LinkedHashSet<>()).add(key);
    }

    OptionalInt get(int key) {
      Entry e = entries.get(key);
      if (e == null) return OptionalInt.empty();
      touch(key, e);
      return OptionalInt.of(e.value);
    }

    void put(int key, int value) {
      if (capacity == 0) return;
      Entry e = entries.get(key);
      if (e != null) {
        e.value = value;
        touch(key, e);
        return;
      }
      if (entries.size() == capacity) {
        LinkedHashSet<Integer> group = groups.get(minimum);
        int victim = group.iterator().next();
        group.remove(victim);
        if (group.isEmpty()) groups.remove(minimum);
        entries.remove(victim);
      }
      entries.put(key, new Entry(value));
      groups.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
      minimum = 1;
    }
  }

  public static void main(String[] args) {
    LFUCache c = new LFUCache(2);
    c.put(1, 10);
    c.put(2, 20);
    c.get(1);
    c.put(3, 30);
    System.out.println(c.get(2).isPresent());
    System.out.println(c.get(1).getAsInt());
  }
}
