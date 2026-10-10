# Print Longest Increasing Subsequence

## Problem and contract

Return one actual strictly increasing subsequence of maximum length, retaining first-found ties.

## Approach

dp[i]=1+max dp[j] for j<i,a[j]<a[i]. Save the chosen predecessor and follow the best endpoint backwards to reconstruct.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

At101, predecessor7 points to5 then2; reversing produces2,5,7,101.

## Complexity

O(n²) time, O(n) space.

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
[2, 5, 7, 101]
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
