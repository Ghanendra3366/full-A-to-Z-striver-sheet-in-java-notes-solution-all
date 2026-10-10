# Longest common subsequence

## Problem and contract

Return length of longest common subsequence of two UTF-16 strings.

## Approach

dp[i][j] uses prefixes of lengths i,j. Equal last characters extend dp[i-1][j-1]; otherwise skip one last character and take max(dp[i-1][j],dp[i][j-1]).

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

a,c,e match in order, though not contiguously, giving3.

## Complexity

O(n*m) time/space; rolling rows can reduce auxiliary space to O(min(n,m)).

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
3
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
