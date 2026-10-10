# Count all subsequences with sum K

## Problem and contract

Count positional subsequences summing to k, including the empty one for k=0.

## Approach

Take/skip every index. The leaf tests the remaining target. Counts add because the branches partition positional subsets.

## Other approaches

Memoize (index,remaining) to avoid repeated states. Nonnegative bounded sums admit subset-sum DP; existence can use a boolean table, counting an integer table.

## Dry run

[1,2,1] reaches sum 2 either by taking index 1 alone or both indices 0,2.

## Complexity

O(2^n) recursive nodes; O(n) stack. BigInteger counting cost additionally depends on count bits.

## Edge cases and Java 8 mistakes

Negatives and zeros are supported, so sum-based positive-only pruning is intentionally absent.

## Run

From this folder:

```sh
javac Solution.java
java Solution
```

Expected output:

```text
2
```

Code: [Solution.java](Solution.java). Methods are reusable; `main` is a deterministic example.

[Curriculum index](../../../../curriculum/COVERAGE.md)
