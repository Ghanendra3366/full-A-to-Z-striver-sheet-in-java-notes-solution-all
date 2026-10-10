# Longest common substring

## Problem and contract

Longest common CONTIGUOUS substring length.

## Approach

dp[i][j] is matching suffix length ending at these positions. Equal characters extend diagonal; a mismatch resets to zero. Maximize over all endpoints.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

abcd occurs contiguously in both strings with length4.

## Complexity

O(n*m) time, O(m) space.

## Edge cases and Java 8 mistakes

Unlike LCS, mismatches cannot inherit top/left values or contiguity would break.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
4
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
