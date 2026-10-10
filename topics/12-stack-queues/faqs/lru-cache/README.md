# LRU Cache

## Problem and contract

Least-recently-used eviction; successful get and put refresh recency. OptionalInt means missing.

## Approach

Access-order LinkedHashMap maintains oldest at the front and newest at the back; remove its first key when capacity is exceeded.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

After put1,put2,get1 recency is [2,1]; put3 evicts 2.

## Complexity

Expected O(1) get/put; O(capacity) storage.

## Edge cases and Java 8 mistakes

Capacity zero stores nothing. This cache is not thread-safe. A handwritten hashmap+doubly-list implementation follows the same recency invariant.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
false
10
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
