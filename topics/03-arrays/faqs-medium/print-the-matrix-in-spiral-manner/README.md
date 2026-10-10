# Print the matrix in spiral manner

## Problem and contract

Return clockwise spiral order of a rectangular matrix.

## Approach

Visit top, right, bottom, left boundaries, then shrink them. Guard bottom and left traversals after shrinking to avoid duplicate visits in a single row or column.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Outer ring 1,2,3,6,9,8,7,4; remaining center is 5.

## Complexity

O(rows*cols) time and output space; O(1) auxiliary state.

## Edge cases and Java 8 mistakes

Ragged arrays are outside the contract. Empty rows/columns return empty.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[1, 2, 3, 6, 9, 8, 7, 4, 5]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
