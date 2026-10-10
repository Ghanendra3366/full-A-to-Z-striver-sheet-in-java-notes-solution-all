# Prims Minimum Spanning Tree

## Problem and contract

Return MST weight of a connected undirected graph; negative edge weights permitted.

## Approach

Heap holds cut edges leaving the current tree. Accept the smallest edge to an unvisited vertex; cut property proves this can belong to an MST. Skip stale edges whose endpoint is already in the tree.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Start0, add edge0-2 cost1, then2-1 cost2 ->total3.

## Complexity

O(E log(E+1)+V) time, O(V+E) space.

## Edge cases and Java 8 mistakes

Initial source cost zero is not a real edge. Reject disconnection rather than silently returning a partial forest.

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
