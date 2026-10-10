# Find eventual safe states

## Problem and contract

A vertex is safe when EVERY possible directed path from it eventually terminates.

## Approach

Reverse edges and eliminate terminal nodes by remaining outdegree. A node becomes safe only after all outgoing targets are already safe; nodes reaching cycles remain.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time and O(V+E) input/working storage; recursive DFS can use O(V) call stack.

## Edge cases and Java 8 mistakes

Having one terminating path is insufficient if another can cycle.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
