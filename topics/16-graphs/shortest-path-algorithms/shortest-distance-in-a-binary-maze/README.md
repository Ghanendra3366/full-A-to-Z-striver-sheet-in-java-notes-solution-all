# Shortest Distance in a Binary Maze

## Problem and contract

Grid 1 is traversable,0 blocked; four-direction minimum EDGE distance between two cells, -1 absent.

## Approach

BFS on open cells finds the first target at shortest unit-step distance.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C) time/space.

## Edge cases and Java 8 mistakes

Some binary-matrix judges use 0 as open, allow eight directions and count cells instead of edges; adapt all three conventions explicitly.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
