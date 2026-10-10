# Swim in Rising Water

## Problem and contract

Time t permits traversing cells with elevation<=t; minimize time to reach bottom-right orthogonally.

## Approach

The path cost is maximum cell elevation. Bottleneck Dijkstra relaxes a neighbor with max(currentTime,neighborElevation).

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C log(R*C)) time/space.

## Edge cases and Java 8 mistakes

Include the starting elevation in the initial cost. This reference also works with repeated heights.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
