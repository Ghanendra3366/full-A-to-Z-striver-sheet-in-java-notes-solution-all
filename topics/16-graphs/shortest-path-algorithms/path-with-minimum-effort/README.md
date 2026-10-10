# Path with minimum effort

## Problem and contract

Minimize the largest absolute height difference along an orthogonal path from top-left to bottom-right.

## Approach

Dijkstra with bottleneck aggregation: extending a path uses max(oldEffort,edgeDifference), a monotone cost. The smallest frontier effort is final.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Trace the demo from its initial frontier, marking each discovered state once; the expected output below records the final result.

## Complexity

O(R*C log(R*C)) time/space.

## Edge cases and Java 8 mistakes

Use long subtraction before abs so extreme int heights are safe. Sum of differences is a different objective.

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
