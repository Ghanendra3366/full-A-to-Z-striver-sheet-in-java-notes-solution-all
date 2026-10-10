import java.util.*;

public class Solution {
  static class DSU {
    final int[] parent, size;

    DSU(int n) {
      parent = new int[n];
      size = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
        size[i] = 1;
      }
    }

    int find(int x) {
      while (x != parent[x]) {
        parent[x] = parent[parent[x]];
        x = parent[x];
      }
      return x;
    }

    boolean union(int a, int b) {
      a = find(a);
      b = find(b);
      if (a == b) return false;
      if (size[a] < size[b]) {
        int t = a;
        a = b;
        b = t;
      }
      parent[b] = a;
      size[a] += size[b];
      return true;
    }
  }

  public static List<List<String>> solve(List<List<String>> accounts) {
    DSU d = new DSU(accounts.size());
    Map<String, Integer> owner = new HashMap<>();
    for (int i = 0; i < accounts.size(); i++)
      for (int j = 1; j < accounts.get(i).size(); j++) {
        String email = accounts.get(i).get(j);
        Integer old = owner.putIfAbsent(email, i);
        if (old != null) d.union(i, old);
      }
    Map<Integer, TreeSet<String>> groups = new TreeMap<>();
    for (Map.Entry<String, Integer> e : owner.entrySet())
      groups.computeIfAbsent(d.find(e.getValue()), k -> new TreeSet<>()).add(e.getKey());
    List<List<String>> out = new ArrayList<>();
    for (Map.Entry<Integer, TreeSet<String>> e : groups.entrySet()) {
      List<String> row = new ArrayList<>();
      row.add(accounts.get(e.getKey()).get(0));
      row.addAll(e.getValue());
      out.add(row);
    }
    for (int i = 0; i < accounts.size(); i++)
      if (accounts.get(i).size() == 1) out.add(new ArrayList<>(accounts.get(i)));
    return out;
  }

  public static void main(String[] args) {
    System.out.println(
        solve(
            Arrays.asList(
                Arrays.asList("John", "a@mail", "b@mail"),
                Arrays.asList("John", "b@mail", "c@mail"))));
  }
}
