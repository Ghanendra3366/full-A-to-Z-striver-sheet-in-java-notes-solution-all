# Detect a cycle in an undirected graph

## Problem and contract

Detect a cycle in an undirected multigraph; self-loops and parallel edges count as cycles.

## Approach

Ignore one edge back to the DFS parent. Any other already visited neighbor closes a cycle. Skip only one parent occurrence so a parallel edge is correctly detected.

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
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
