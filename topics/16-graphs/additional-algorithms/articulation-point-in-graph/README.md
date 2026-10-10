# Articulation point in graph

## Problem and contract

Return sorted vertices whose removal increases the number of undirected components.

## Approach

A nonroot is a cut vertex if some child subtree has low>=in[root], so it cannot escape above that vertex. A DFS root needs more than one independent DFS child.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time and O(V+E) input/working storage; recursive DFS can use O(V) call stack.

## Edge cases and Java 8 mistakes

Use >= for articulation, > for bridge. The DFS root has a separate condition. Restart DFS for each component.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[2]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
