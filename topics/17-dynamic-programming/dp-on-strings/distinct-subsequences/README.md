# Distinct subsequences

## Problem and contract

Count positional subsequences of source equal to target; exact count, empty target one.

## Approach

dp[j] counts matches of target prefix j. For each source character, matching positions add dp[j-1]; descend j so one source position cannot serve multiple target positions.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Choose any two of the three middle bs to form rabbit: three ways.

## Complexity

O(n*m) BigInteger additions, O(m) stored counts.

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
