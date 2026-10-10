import java.util.*;

public class Solution {
  static class Twitter {
    static class Tweet {
      int id;
      long time;

      Tweet(int id, long time) {
        this.id = id;
        this.time = time;
      }
    }

    long clock;
    final Map<Integer, List<Tweet>> posts = new HashMap<>();
    final Map<Integer, Set<Integer>> following = new HashMap<>();

    void postTweet(int user, int id) {
      posts.computeIfAbsent(user, k -> new ArrayList<>()).add(new Tweet(id, clock++));
    }

    void follow(int user, int other) {
      following.computeIfAbsent(user, k -> new HashSet<>()).add(other);
    }

    void unfollow(int user, int other) {
      Set<Integer> set = following.get(user);
      if (set != null) set.remove(other);
    }

    List<Integer> getNewsFeed(int user) {
      Set<Integer> users = new HashSet<>(following.getOrDefault(user, Collections.emptySet()));
      users.add(user);
      PriorityQueue<Tweet> q = new PriorityQueue<>((a, b) -> Long.compare(a.time, b.time));
      for (int u : users)
        for (Tweet t : posts.getOrDefault(u, Collections.emptyList())) {
          q.offer(t);
          if (q.size() > 10) q.poll();
        }
      List<Integer> out = new ArrayList<>();
      while (!q.isEmpty()) out.add(q.poll().id);
      Collections.reverse(out);
      return out;
    }
  }

  public static void main(String[] args) {
    Twitter t = new Twitter();
    t.postTweet(1, 5);
    t.follow(1, 2);
    t.postTweet(2, 6);
    System.out.println(t.getNewsFeed(1));
    t.unfollow(1, 2);
    System.out.println(t.getNewsFeed(1));
  }
}
