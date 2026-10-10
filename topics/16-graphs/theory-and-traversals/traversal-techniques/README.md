# Traversal Techniques

## Problem and contract

BFS from source in an undirected graph; only its reachable component is returned. visit is the reusable recursive DFS helper.

## Approach

BFS marks vertices on ENQUEUE, so each appears once; its FIFO frontier visits increasing distance layers. DFS instead finishes a neighbor branch before the next.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V+E) time and O(V+E) input/working storage; recursive DFS can use O(V) call stack.

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
[0, 1, 2, 3]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
