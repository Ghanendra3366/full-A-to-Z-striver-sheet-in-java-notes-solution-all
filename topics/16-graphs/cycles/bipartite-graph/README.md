# Bipartite graph

## Problem and contract

Determine whether vertices can split into two groups with no same-group edge.

## Approach

BFS alternates colors across every edge. A same-color edge contradicts two-colorability; consistent coloring of all components proves a bipartition.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time and O(V+E) input/working storage; recursive DFS can use O(V) call stack.

## Edge cases and Java 8 mistakes

A self-loop is never bipartite. Even cycles may be bipartite; odd cycles are not.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
false
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
