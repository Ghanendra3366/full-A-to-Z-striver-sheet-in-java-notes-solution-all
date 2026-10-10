# Minimum time taken to burn the BT from a given Node

## Problem and contract

Fire starts at target at time zero and spreads one edge per unit time; return time until all tree nodes burn.

## Approach

Reuse undirected BFS from the target. The last layer number is the farthest distance, which determines completion time.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

From leaf 1, leaf 7 is reached via 1,2,4,6,7 at time four.

## Complexity

O(n) time/space.

## Edge cases and Java 8 mistakes

The result counts elapsed edges, not number of layers. Target membership is validated.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
