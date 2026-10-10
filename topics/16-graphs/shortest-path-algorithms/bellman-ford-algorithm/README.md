# Bellman ford algorithm

## Problem and contract

Directed weighted distances with negative edges; throw on a negative cycle reachable from source. INF means unreachable.

## Approach

A simple shortest path has at most V-1 edges. Repeatedly relax every edge; a further improvement after V-1 rounds proves a reachable negative cycle.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V*E) time; O(V) working space.

## Edge cases and Java 8 mistakes

Do not relax from INF. Unreachable negative cycles do not affect this source-specific result.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 4, 2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
