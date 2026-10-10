# Rod cutting problem

## Problem and contract

prices[i] is sale value of length i+1. Cut and sell the WHOLE rod of length prices.length, pieces reusable.

## Approach

dp[length]=max over first cut of price[cut-1]+dp[length-cut]. Smaller lengths are available first; exact length is required even for negative prices.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Length5 can split2+2+1 for5+5+2=12.

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
12
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
