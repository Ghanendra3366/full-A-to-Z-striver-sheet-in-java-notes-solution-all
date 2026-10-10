# Design Twitter

## Problem and contract

In-memory post/follow/unfollow/feed API. Feed includes own posts and followed users, newest first, limited to ten.

## Approach

Assign a monotone timestamp per post. For a feed scan eligible histories retaining the newest ten in a min-heap, then reverse their extracted order.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

User 1 sees own tweet 5 and followed user 2's newer 6; after unfollow only 5 remains.

## Complexity

O(1) amortized post/follow/unfollow with hash maps; O(H log 10) feed time for H eligible historical posts; O(total posts+follow edges) stored state.

## Edge cases and Java 8 mistakes

Self-follow is harmless because feed users form a set. This reference prioritizes clarity; a k-way heap over each user's last post reduces feed work to O(followees+10 log followees).

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[6, 5]
[5]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
