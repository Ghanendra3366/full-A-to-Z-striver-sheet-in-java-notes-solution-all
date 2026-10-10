# LFU Cache

## Problem and contract

Least-frequently-used eviction; ties choose least recently used among that frequency. Get and update put increase frequency; new entries start at one.

## Approach

Map keys to entries; map each frequency to an insertion-ordered set. Touch moves key to the next frequency group's newest end. minimum tracks the smallest live frequency; evict its oldest key.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

get1 raises its frequency to two; put3 evicts key2 at frequency one.

## Complexity

Expected O(1) get/put, O(capacity) live storage.

## Edge cases and Java 8 mistakes

Empty groups are removed to bound metadata. Frequency int overflow after billions of accesses is outside this teaching contract; production implementations need an aging/overflow policy.

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
