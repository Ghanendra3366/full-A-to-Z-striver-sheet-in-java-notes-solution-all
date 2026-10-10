# Count Square Submatrices with All Ones

## Problem and contract

Count all-one axis-aligned square submatrices of a binary rectangular grid.

## Approach

dp[r][c] is largest side ending at (r,c), one plus min(top,left,diagonal) for a one. Every side1..dp exists there, so add dp to total.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Four unit squares plus one 2x2 square gives5.

## Complexity

O(R*C) time, O(C) space.

## Edge cases and Java 8 mistakes

Validate nonnegative size/target parameters and respect the stated input domain. Java array dimensions must fit memory; recursion alternatives may exhaust the call stack.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
5
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
