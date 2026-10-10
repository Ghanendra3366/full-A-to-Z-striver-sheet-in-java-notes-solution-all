# Set Matrix Zeroes

## Problem and contract

For every ORIGINAL zero, set its whole row and column to zero in place. Matrix is rectangular.

## Approach

Use first row/column as markers, while saving whether those original borders themselves need zeroing. Read all interior markers before overwriting the borders.

## Other approaches

A copy costs O(mn) space; separate row/column flags cost O(m+n) space.

## Dry run

Center zero marks a[1][0] and a[0][1]; interior pass zeros row 1 and column 1.

## Complexity

O(mn) time; O(1) auxiliary space.

## Edge cases and Java 8 mistakes

Zeroing immediately while discovering zeros propagates false zeros. Empty matrix is valid.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
[[1, 0, 1], [0, 0, 0], [1, 0, 1]]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../COVERAGE.md)
