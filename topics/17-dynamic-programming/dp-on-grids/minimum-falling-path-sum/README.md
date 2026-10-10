# Minimum Falling Path Sum

## Problem and contract

Start anywhere in row0; move down-left,down,down-right each row. Return minimum path sum.

## Approach

dp[r][c]=a[r][c]+min of valid predecessor columns c-1,c,c+1. Only the previous row is needed.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

1->5->7 sums13; 1->4->8 also sums13.

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
13
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
