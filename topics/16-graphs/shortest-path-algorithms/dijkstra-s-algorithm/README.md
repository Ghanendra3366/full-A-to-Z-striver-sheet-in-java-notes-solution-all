# Dijkstra's algorithm

## Problem and contract

Undirected edges [u,v,nonnegative weight]; return distances, INF=Long.MAX_VALUE/4 for unreachable.

## Approach

The smallest unsettled distance cannot improve via an unsettled node when weights are nonnegative. Relax its outgoing edges; stale heap records are skipped.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O((V+E) log(V+E)) time; O(V+E) storage including lazy heap.

## Edge cases and Java 8 mistakes

Negative weights invalidate Dijkstra. INF is an absence sentinel; supported finite path costs must be below INF.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 3, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
