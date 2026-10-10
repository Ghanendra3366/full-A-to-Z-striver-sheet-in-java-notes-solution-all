# Number of islands II

## Problem and contract

Start all water; each operation adds land at a valid cell, returning four-connected island count after every operation.

## Approach

New land adds one component; each successful union with a distinct neighbor component removes one. Repeated land additions change nothing.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C+operations*alpha(R*C)) time; O(R*C) space.

## Edge cases and Java 8 mistakes

Grid dimensions/product and all coordinates must fit valid int array bounds. Count only successful unions, not every neighboring land cell.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 1, 1]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
