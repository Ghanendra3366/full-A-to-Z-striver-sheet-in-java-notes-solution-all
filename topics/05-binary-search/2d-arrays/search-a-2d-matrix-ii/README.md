# Search a 2D Matrix II

## Problem and contract

Rectangular matrix has each row and column nondecreasing; search target.

## Approach

Start top-right. If current is too large, its column below is too large as well; discard the column. If too small, its row to the left is too small; discard the row.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

7>6 move left to 4; 4<6 move down to 5; 5<6 move down to 6.

## Complexity

O(rows+cols) time; O(1) space.

## Edge cases and Java 8 mistakes

This staircase walk needs both row and column monotonicity.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
true
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
