# Number of ways to arrive at destination

## Problem and contract

Count shortest paths from 0 to n-1 modulo 1e9+7, n>=1 and strictly POSITIVE undirected weights.

## Approach

Dijkstra resets ways on a strictly improved distance and adds ways on an equal distance. Positive edges ensure all contributing predecessors have smaller finalized distance.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O((V+E)log(V+E)) time/space.

## Edge cases and Java 8 mistakes

Zero-weight cycles make shortest-walk counts ambiguous and break this simple counting-order proof; they are rejected.

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
