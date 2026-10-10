# Find Peak Element in a 2D Matrix

## Problem and contract

Find a cell strictly larger than its four orthogonal neighbors; assume orthogonally adjacent values differ. Outside is -infinity.

## Approach

Choose the maximum in the middle column, already larger than vertical neighbors. If a horizontal neighbor is larger, a peak exists toward that side; binary search columns.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Column 0 maximum is 3 at row 1; its right neighbor is 2 and vertical neighbor is 1, so (1,0) is a peak.

## Complexity

O(rows log(cols+1)) time; O(1) space.

## Edge cases and Java 8 mistakes

Equal adjacent values violate the strict-peak assumption. Negative values are safe with long boundary sentinels.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 0]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
