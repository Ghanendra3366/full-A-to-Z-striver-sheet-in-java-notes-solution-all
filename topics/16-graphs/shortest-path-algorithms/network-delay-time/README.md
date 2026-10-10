# Network Delay Time

## Problem and contract

Directed nonnegative edges; time for a source signal to reach every vertex, -1 if some unreachable.

## Approach

Dijkstra yields earliest arrival times; all vertices have received the signal at their maximum arrival.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O((V+E)log(V+E)) time/space.

## Edge cases and Java 8 mistakes

This adapter is zero-based; convert one-based judge vertex labels before calling.

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
