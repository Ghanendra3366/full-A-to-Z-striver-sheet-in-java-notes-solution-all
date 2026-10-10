# Number of provinces

## Problem and contract

Count components in a symmetric adjacency matrix.

## Approach

Convert each nonzero off-diagonal entry to an adjacency relation and traverse every unvisited vertex.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V²) time/space for matrix-to-list conversion; O(V) DFS stack.

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
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
