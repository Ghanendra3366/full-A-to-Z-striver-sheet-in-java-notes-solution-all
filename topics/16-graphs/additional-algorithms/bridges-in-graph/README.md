# Bridges in graph

## Problem and contract

Return undirected edges whose removal increases component count, endpoint pairs sorted.

## Approach

DFS discovery in[u] and low[u] summarize earliest ancestor reachable from a subtree via at most one back edge. A child edge is a bridge iff low[child]>in[parent].

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time and O(V+E) input/working storage; recursive DFS can use O(V) call stack.

## Edge cases and Java 8 mistakes

Track parent EDGE ID, not just parent vertex, so parallel edges correctly provide a back edge and are not falsely reported as bridges.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[2, 3]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
