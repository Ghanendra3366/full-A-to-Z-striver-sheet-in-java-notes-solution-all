# Rotten Oranges

## Problem and contract

0 empty,1 fresh,2 rotten. Every minute rot spreads orthogonally; return minutes until no fresh remain or -1. Preserve input.

## Approach

Enqueue all initial rotten cells, then process one BFS layer per minute. Mark newly rotten on enqueue so simultaneous sources do not double count.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C) time/space.

## Edge cases and Java 8 mistakes

No fresh cells means zero minutes even with no rotten source. Empty cells block spread.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
