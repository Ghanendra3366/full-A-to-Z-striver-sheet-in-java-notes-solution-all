# Find the city with the smallest number of neighbors

## Problem and contract

Undirected weighted graph; choose city with fewest OTHER cities within threshold; ties choose largest index.

## Approach

Compute all-pairs distances, count eligible neighbors, update on <= to retain the later index in ties.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(V³+E) time; O(V²+E) space.

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
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
