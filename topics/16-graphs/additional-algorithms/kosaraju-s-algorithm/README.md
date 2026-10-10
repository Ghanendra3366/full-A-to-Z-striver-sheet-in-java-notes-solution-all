# Kosaraju's algorithm

## Problem and contract

Count strongly connected components in a directed graph.

## Approach

DFS finish order ranks SCCs in the condensation DAG. Reverse edges and traverse in decreasing finish time so each DFS remains within one SCC before moving to another.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time and O(V+E) input/working storage; recursive DFS can use O(V) call stack.

## Edge cases and Java 8 mistakes

An SCC requires mutual reachability; weak undirected components solve a different problem.

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
