# Rotate matrix by 90 degrees

## Problem and contract

Rotate a square matrix clockwise by 90 degrees in place.

## Approach

Transpose maps (r,c) to (c,r); reversing each row then maps to (c,n-1-r), the clockwise position.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

[[1,2],[3,4]] -> transpose [[1,3],[2,4]] -> reverse rows [[3,1],[4,2]].

## Complexity

O(n²) time, O(1) auxiliary space.

## Edge cases and Java 8 mistakes

Only transpose above the diagonal; transposing both halves would undo swaps. Rectangular matrices need a new differently shaped array.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[3, 1], [4, 2]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
