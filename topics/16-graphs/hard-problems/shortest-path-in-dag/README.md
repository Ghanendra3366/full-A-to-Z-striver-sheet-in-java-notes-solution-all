# Shortest path in DAG

## Problem and contract

Directed acyclic weighted graph, negative weights allowed. INF denotes unreachable.

## Approach

Topological order guarantees all incoming predecessors finish before a vertex is processed. One relaxation per edge is enough.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time/storage aside from included helper methods not called.

## Edge cases and Java 8 mistakes

Reject cycles. Skip INF vertices before addition to avoid fake reachable distances.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 2, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
