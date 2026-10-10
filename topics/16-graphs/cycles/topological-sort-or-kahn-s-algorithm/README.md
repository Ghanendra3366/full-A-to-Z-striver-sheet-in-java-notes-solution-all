# Topological sort or Kahn's algorithm

## Problem and contract

Return a topological ordering or empty on a directed cycle. Edges are [prerequisite,dependent], NOT the reversed pair format of some course judges.

## Approach

Remove zero-indegree vertices and decrement dependents. A DAG always has a zero-indegree vertex; processing fewer than V vertices proves a cycle.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time and O(V+E) input/working storage; recursive DFS can use O(V) call stack.

## Edge cases and Java 8 mistakes

Adapt course prerequisite pairs explicitly: a judge pair [course,prerequisite] must be reversed before this method.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[0, 1, 2, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
