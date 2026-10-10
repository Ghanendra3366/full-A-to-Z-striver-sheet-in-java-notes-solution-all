# Minimum coins

## Problem and contract

Unlimited positive denominations; minimize coins summing EXACTLY to target, -1 absent.

## Approach

For each denomination, ascending sums allow reuse; minimize1+prior count. target+1 is an impossible-count sentinel because every usable coin is at least one.

## Other approaches

Direct recursion follows the stated recurrence but may repeat overlapping states exponentially. Memoize the complete state to compute each once; tabulation in dependency order removes recursive frames. Rolling storage is valid only when all still-needed dependencies are retained. The provided code implements the method described above; alternative variants are explanations unless a separately named method is present.

## Dry run

11=5+5+1 uses three coins.

## Complexity

O(n*target) time, O(target) space.

## Edge cases and Java 8 mistakes

target must leave room for target+1 without int overflow and fit memory. Denomination duplicates do not affect minimum.

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
