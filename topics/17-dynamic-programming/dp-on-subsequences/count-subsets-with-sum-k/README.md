# Count subsets with sum K

## Problem and contract

Count POSITIONAL subsets of nonnegative entries summing to target; return exact BigInteger.

## Approach

Counts add take and skip branches. Descending update prevents reuse; x=0 doubles every count because taking or skipping that zero are different positional choices.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

Each of two zeros is independently taken/skipped while1 is required, giving four.

## Complexity

O(n*target) BigInteger additions; O(target) stored values.

## Edge cases and Java 8 mistakes

Do not initialize dp[0] to one after every item; that would erase zero multiplicities.

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
