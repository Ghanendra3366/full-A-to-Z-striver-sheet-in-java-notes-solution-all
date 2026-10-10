# Maximum sum of non adjacent elements

## Problem and contract

Nonnegative array; maximize sum of a subset with no adjacent chosen indices. Empty subset allowed.

## Approach

dp[i]=max(dp[i-1],a[i]+dp[i-2]): skip or take the last value. Keep two preceding states.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Choose 2 and 9 for 11; choosing 4 would prevent adjacent 9.

## Complexity

O(n) time, O(1) space.

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
11
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
