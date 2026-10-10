# Floyd warshall algorithm

## Problem and contract

All-pairs shortest directed distances, rejecting any negative cycle. INF means no path.

## Approach

After iteration k, paths may use only intermediates 0..k. A path either avoids k or splits into i->k and k->j, giving the update.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V³) time; O(V²) space.

## Edge cases and Java 8 mistakes

k must be the outer loop for this DP invariant. Parallel edges use minimum weight; unreachable halves are skipped.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[0, 2, 5], [7, 0, 3], [4, 6, 0]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
