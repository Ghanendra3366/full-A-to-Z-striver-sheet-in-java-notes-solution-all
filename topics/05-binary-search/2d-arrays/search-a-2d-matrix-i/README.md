# Search a 2D Matrix I

## Problem and contract

Rectangular matrix is globally sorted in row-major order: each row sorted and every new row starts after the previous row ends.

## Approach

Treat the matrix as a virtual sorted array; index m maps to row m/cols and column m%cols.

## Other approaches

The direct method already meets the stated contract. See the invariant in the approach; no artificial extra approach is required.

## Dry run

Virtual array [1,3,5,7,9,11]; 9 is at flat index 4 -> (1,1).

## Complexity

O(log(rows*cols)) time; O(1) space.

## Edge cases and Java 8 mistakes

Row/column sorting alone is insufficient; that requires Matrix II.

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
