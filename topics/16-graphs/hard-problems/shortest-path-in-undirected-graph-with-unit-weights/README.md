# Shortest path in undirected graph with unit weights

## Problem and contract

Unweighted undirected shortest edge distances; -1 for unreachable.

## Approach

FIFO BFS processes distance d before d+1; first discovery of a neighbor therefore has the shortest distance.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time and O(V+E) input/working storage; recursive DFS can use O(V) call stack.

## Edge cases and Java 8 mistakes

Use zero-based vertices, validate input shape at the call site, and restart traversals for disconnected components where required.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 1, 2, -1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
