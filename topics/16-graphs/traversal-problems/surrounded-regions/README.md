# Surrounded Regions

## Problem and contract

Flip O components not touching the border to X, in place.

## Approach

Mark O as land in an auxiliary grid and remove border-connected land. Cells still marked are surrounded and must flip.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C) time/space.

## Edge cases and Java 8 mistakes

Only X/O input is intended. Keeping border-reachable O differs from replacing all O.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[X, X, X], [X, X, X], [X, X, X]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
