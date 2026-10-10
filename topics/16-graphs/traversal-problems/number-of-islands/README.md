# Number of islands

## Problem and contract

Binary rectangular grid; islands use FOUR-direction adjacency. Preserve input.

## Approach

Each discovered land cell starts a flood fill of its component. Replace visited land with zero in a copy so it is never recounted.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C) time/space, including DFS depth and copy.

## Edge cases and Java 8 mistakes

Some versions use eight directions. This lesson explicitly uses four; add diagonals for the other version. Deep grid DFS may need an iterative stack.

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
