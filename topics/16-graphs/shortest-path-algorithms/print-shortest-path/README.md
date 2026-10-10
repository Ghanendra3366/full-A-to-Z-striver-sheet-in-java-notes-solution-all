# Print Shortest Path

## Problem and contract

Return one shortest node path in a nonnegative undirected graph, empty if target unreachable.

## Approach

Compute distances, then BFS through tight edges satisfying d[u]+w=d[v]. Tight edges preserve shortest cost; seen prevents zero-weight tight cycles. Their parent chain gives a shortest path.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O((V+E)log(V+E)) time; O(V+E) space.

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
[0, 2, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
